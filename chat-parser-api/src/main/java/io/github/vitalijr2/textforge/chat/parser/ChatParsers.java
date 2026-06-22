package io.github.vitalijr2.textforge.chat.parser;

import java.io.Reader;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

public final class ChatParsers {

  private ChatParsers() {
  }

  public static ChatParser createParser(ChatSource chatSource) throws UnsupportedFormatException {
    var chatParser = ServiceLoader.load(ChatParserProvider.class).stream().map(Provider::get)
        .filter(parserProvider -> parserProvider.supports(chatSource)).findAny();

    return chatParser.orElseThrow(() -> new UnsupportedFormatException(chatSource)).createParser();
  }

}
