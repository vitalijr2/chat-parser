package io.github.vitalijr2.textforge.chat.parser;

public interface ChatParserProvider {

  ChatParser createParser();

  boolean supports(ChatSource chatSource);

}
