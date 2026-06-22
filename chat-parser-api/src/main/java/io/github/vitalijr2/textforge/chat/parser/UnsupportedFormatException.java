package io.github.vitalijr2.textforge.chat.parser;

// TODO: implement a detailed exception
public class UnsupportedFormatException extends Throwable {

  private ChatSource chatSource;

  public UnsupportedFormatException(ChatSource chatSource) {
    super("No suitable parser found");
    this.chatSource = chatSource;
  }

}
