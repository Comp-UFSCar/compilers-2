// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReceiptParser}.
 */
public interface ReceiptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receipt}.
	 * @param ctx the parse tree
	 */
	void enterReceipt(@NotNull ReceiptParser.ReceiptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receipt}.
	 * @param ctx the parse tree
	 */
	void exitReceipt(@NotNull ReceiptParser.ReceiptContext ctx);
}