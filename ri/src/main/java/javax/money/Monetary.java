/*
 *  Copyright (c) 2012, 2013, Credit Suisse (Anatole Tresch), Werner Keil.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * Contributors:
 *    Anatole Tresch - initial implementation
 *    Wernner Keil - extensions and adaptions.
 */
package javax.money;

import javax.money.convert.ExchangeRateProvider;
import javax.money.format.AmountFormatterFactory;
import javax.money.format.AmountParserFactory;
import javax.money.format.CurrencyFormatterFactory;
import javax.money.format.CurrencyParserFactory;

/**
 * This is the main accessor component for Java Money.
 * 
 * @author Anatole Tresch
 * 
 */
public final class Monetary {

	/**
	 * Singleton constructor.
	 */
	private Monetary() {
	}

	/**
	 * Access the {@link RegionProvider} component.
	 * 
	 * @return the {@link RegionProvider} component, never {@code null}.
	 */
	public static RegionProvider getRegionProvider() {
		return null;
	}

	/**
	 * Access the {@link MonetaryAmountFactory} component.
	 * 
	 * @return the {@link MonetaryAmountFactory} component, never {@code null}.
	 */
	public static MonetaryAmountFactory getMonetaryAmountFactory() {
		return null;
	}

	/**
	 * Access the {@link CurrencyUnitProvider} component.
	 * 
	 * @return the {@link CurrencyUnitProvider} component, never {@code null}.
	 */
	public static CurrencyUnitProvider getCurrencyUnitProvider() {
		return null;
	}

	/**
	 * Access the {@link ExchangeRateProvider} component.
	 * 
	 * @return the {@link ExchangeRateProvider} component, never {@code null}.
	 */
	public static ExchangeRateProvider getExchangeRateProvider() {
		return null;
	}

	/**
	 * Access the {@link AmountFormatterFactory} component.
	 * 
	 * @return the {@link AmountFormatterFactory} component, never {@code null}.
	 */
	public static AmountFormatterFactory getAmountFormatterFactory() {
		return null;
	}

	/**
	 * Access the {@link AmountParserFactory} component.
	 * 
	 * @return the {@link AmountParserFactory} component, never {@code null}.
	 */
	public static AmountParserFactory getAmountParserFactory() {
		return null;
	}

	/**
	 * Access the {@link CurrencyFormatterFactory} component.
	 * 
	 * @return the {@link CurrencyFormatterFactory} component, never
	 *         {@code null}.
	 */
	public static CurrencyFormatterFactory getCurrencyFormatterFactory() {
		return null;
	}

	/**
	 * Access the {@link CurrencyParserFactory} component.
	 * 
	 * @return the {@link CurrencyParserFactory} component, never {@code null}.
	 */
	public static CurrencyParserFactory getCurrencyParserFactory() {
		return null;
	}

	/**
	 * Access the {@link RoundingProvider} component.
	 * 
	 * @return the {@link RoundingProvider} component, never {@code null}.
	 */
	public static RoundingProvider getRoundingProvider() {
		return null;
	}
}
