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
	 * Enter a parse tree produced by {@link ReceiptParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull ReceiptParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull ReceiptParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull ReceiptParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull ReceiptParser.AddressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#city}.
	 * @param ctx the parse tree
	 */
	void enterCity(@NotNull ReceiptParser.CityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#city}.
	 * @param ctx the parse tree
	 */
	void exitCity(@NotNull ReceiptParser.CityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#tax}.
	 * @param ctx the parse tree
	 */
	void enterTax(@NotNull ReceiptParser.TaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#tax}.
	 * @param ctx the parse tree
	 */
	void exitTax(@NotNull ReceiptParser.TaxContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#cnpj}.
	 * @param ctx the parse tree
	 */
	void enterCnpj(@NotNull ReceiptParser.CnpjContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#cnpj}.
	 * @param ctx the parse tree
	 */
	void exitCnpj(@NotNull ReceiptParser.CnpjContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#buyer}.
	 * @param ctx the parse tree
	 */
	void enterBuyer(@NotNull ReceiptParser.BuyerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#buyer}.
	 * @param ctx the parse tree
	 */
	void exitBuyer(@NotNull ReceiptParser.BuyerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#ssn}.
	 * @param ctx the parse tree
	 */
	void enterSsn(@NotNull ReceiptParser.SsnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#ssn}.
	 * @param ctx the parse tree
	 */
	void exitSsn(@NotNull ReceiptParser.SsnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(@NotNull ReceiptParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(@NotNull ReceiptParser.ProductsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#zipcode}.
	 * @param ctx the parse tree
	 */
	void enterZipcode(@NotNull ReceiptParser.ZipcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#zipcode}.
	 * @param ctx the parse tree
	 */
	void exitZipcode(@NotNull ReceiptParser.ZipcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#total}.
	 * @param ctx the parse tree
	 */
	void enterTotal(@NotNull ReceiptParser.TotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#total}.
	 * @param ctx the parse tree
	 */
	void exitTotal(@NotNull ReceiptParser.TotalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#identification}.
	 * @param ctx the parse tree
	 */
	void enterIdentification(@NotNull ReceiptParser.IdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#identification}.
	 * @param ctx the parse tree
	 */
	void exitIdentification(@NotNull ReceiptParser.IdentificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#cpf}.
	 * @param ctx the parse tree
	 */
	void enterCpf(@NotNull ReceiptParser.CpfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#cpf}.
	 * @param ctx the parse tree
	 */
	void exitCpf(@NotNull ReceiptParser.CpfContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ReceiptParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ReceiptParser.NameContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#company}.
	 * @param ctx the parse tree
	 */
	void enterCompany(@NotNull ReceiptParser.CompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#company}.
	 * @param ctx the parse tree
	 */
	void exitCompany(@NotNull ReceiptParser.CompanyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ReceiptParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ReceiptParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull ReceiptParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull ReceiptParser.StateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ReceiptParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(@NotNull ReceiptParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(@NotNull ReceiptParser.EntityContext ctx);
}