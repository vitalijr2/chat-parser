package io.github.vitalijr2.textforge.chat.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class ChatParsersTest {

  @Mock
  private ChatSource chatSource;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @DisplayName("Cannot find any parser")
  @Test
  void cannotFindAnyParser() {
    // when
    var exception = assertThrows(UnsupportedFormatException.class, () -> ChatParsers.createParser(chatSource));

    // then
    assertEquals("No suitable parser found", exception.getMessage());
  }

}