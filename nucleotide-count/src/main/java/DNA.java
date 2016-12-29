import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class DNA {
  private final Map<Character, Integer> nucleotideMap = new HashMap<>();
  private final String dnaSequence;

  public DNA(String dnaSequence) {
    this.dnaSequence = dnaSequence;
    initializeDefaultNucleotideMap();
    if (!dnaSequence.isEmpty()) {
      countNucleotides();
    }
  }

  private Map<Character, Integer> initializeDefaultNucleotideMap() {
    nucleotideMap.put('A', 0);
    nucleotideMap.put('C', 0);
    nucleotideMap.put('G', 0);
    nucleotideMap.put('T', 0);
    return nucleotideMap;
  }

  private void countNucleotides() {
    for (Character chr : dnaSequence.toCharArray()) {
      nucleotideMap.put(chr, nucleotideMap.get(chr) + 1);
    }
  }

  public int count(char nucleotide) {
    if (!nucleotideMap.containsKey(nucleotide)) {
      throw new IllegalArgumentException("Invalid nucleotide");
    }
    return nucleotideMap.get(nucleotide);
  }

  public Map<Character, Integer> nucleotideCounts() {
    return Collections.unmodifiableMap(nucleotideMap);
  }
}