package io.github.vitalijr2.textforge.chat.parser;

import java.io.IOException;
import java.io.Reader;

public interface ChatSource {

  Reader openReader();

  String name();

  String sample(int maxLines) throws IOException;

  String sourceId();

}
