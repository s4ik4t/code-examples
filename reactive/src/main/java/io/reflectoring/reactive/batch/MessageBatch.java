package io.reflectoring.reactive.batch;

import java.util.Collections;
import java.util.List;

public class MessageBatch {

  private final List<Message> messages;

  public MessageBatch(List<Message> messages) {
    this.messages = messages;
  }

  public List<Message> getMessages() {
    return Collections.unmodifiableList(messages);
  }

  @Override
  public String toString() {
    return "MessageBatch{" +
        "messages=" + messages +
        '}';
  }
}
