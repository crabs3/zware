// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.StructMethod.isSynthetic()" because "mt" is null
//   at org.jetbrains.java.decompiler.main.ClassesProcessor.processClass(ClassesProcessor.java:465)
//   at org.jetbrains.java.decompiler.main.Fernflower.processClass(Fernflower.java:188)
//   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$2(ContextUnit.java:171)
// Caused by: java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.StructMethod.isSynthetic()" because "mt" is null
//   at org.jetbrains.java.decompiler.main.ClassesProcessor$ClassNode.<init>(ClassesProcessor.java:649)
//   at org.jetbrains.java.decompiler.main.rels.LambdaProcessor.processClass(LambdaProcessor.java:89)
//   at org.jetbrains.java.decompiler.main.ClassesProcessor.processClass(ClassesProcessor.java:445)
//   at org.jetbrains.java.decompiler.main.Fernflower.processClass(Fernflower.java:188)
//   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$2(ContextUnit.java:171)
