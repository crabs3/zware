package Dev.ZWare.Client.pkg1.pkg6.pkg3;

import com.google.common.collect.Multimap;
import java.util.HashSet;
import java.util.Set;

public class Class2 {
   // $VF: renamed from: a com.google.common.collect.Multimap
   private final Multimap<Integer, Class1> field_126;
   // $VF: renamed from: b java.lang.String
   private final String field_127;
   // $VF: renamed from: c java.lang.String
   private final String field_128;
   // $VF: renamed from: d java.util.Set
   private final Set<Class1> field_129 = new HashSet<>();
   // $VF: renamed from: e int
   private int field_130;
   // $VF: renamed from: f boolean
   private boolean field_131;

   public Class2(Multimap<Integer, Class1> notesMap, String title, String author) {
      this.field_126 = notesMap;
      this.field_127 = title;
      this.field_128 = author;
   }

   // $VF: renamed from: a () void
   public void method_274() {
      if (this.field_131) {
         throw new IllegalStateException("Song has already finished loading.");
      } else {
         this.field_130 = this.field_126.isEmpty() ? 0 : this.field_126.keySet().stream().mapToInt(Integer::intValue).max().orElse(0);
         this.field_129.addAll(this.field_126.values().stream().distinct().toList());
         this.field_131 = true;
      }
   }

   // $VF: renamed from: a () com.google.common.collect.Multimap
   public Multimap<Integer, Class1> method_275() {
      return this.field_126;
   }

   // $VF: renamed from: a () java.util.Set
   public Set<Class1> method_276() {
      if (!this.field_131) {
         throw new IllegalStateException("Song is still loading.");
      } else {
         return this.field_129;
      }
   }

   // $VF: renamed from: a () int
   public int method_277() {
      if (!this.field_131) {
         throw new IllegalStateException("Song is still loading.");
      } else {
         return this.field_130;
      }
   }

   // $VF: renamed from: a () java.lang.String
   public String method_278() {
      return this.field_127;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_279() {
      return this.field_128;
   }
}
