<<<<<<< Updated upstream:src/antlr/languageVisitor.java
<<<<<<< Updated upstream:src/antlr/languageVisitor.java
// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/main/java/antlr/language.g4 by ANTLR 4.9.2
package antlr;
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageVisitor.java
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageVisitor.java
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(languageParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(languageParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(languageParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
<<<<<<< Updated upstream:src/antlr/languageVisitor.java
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(languageParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(languageParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
=======
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(languageParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(languageParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
>>>>>>> Stashed changes:src/main/java/grammar/languageVisitor.java
	T visitNumber(languageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(languageParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForever_loop(languageParser.Forever_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(languageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#idORvalue_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#greather}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreather(languageParser.GreatherContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#lesser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser(languageParser.LesserContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(languageParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#greatherORequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreatherORequal(languageParser.GreatherORequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#lesserORequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserORequal(languageParser.LesserORequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#isNOTequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNOTequal(languageParser.IsNOTequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(languageParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(languageParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(languageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(languageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(languageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#iDorVALUE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDorVALUE(languageParser.IDorVALUEContext ctx);
}