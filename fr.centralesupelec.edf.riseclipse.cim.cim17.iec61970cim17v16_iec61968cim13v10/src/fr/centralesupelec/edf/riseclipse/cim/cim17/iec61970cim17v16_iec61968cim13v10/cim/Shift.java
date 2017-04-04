/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getActivityInterval <em>Activity Interval</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipts Grand Total Bankable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipts Grand Total Bankable</em>' attribute.
     * @see #isSetReceiptsGrandTotalBankable()
     * @see #unsetReceiptsGrandTotalBankable()
     * @see #setReceiptsGrandTotalBankable(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_ReceiptsGrandTotalBankable()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.receiptsGrandTotalBankable' kind='element'"
     * @generated
     */
    BigDecimal getReceiptsGrandTotalBankable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receipts Grand Total Bankable</em>' attribute.
     * @see #isSetReceiptsGrandTotalBankable()
     * @see #unsetReceiptsGrandTotalBankable()
     * @see #getReceiptsGrandTotalBankable()
     * @generated
     */
    void setReceiptsGrandTotalBankable( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiptsGrandTotalBankable()
     * @see #getReceiptsGrandTotalBankable()
     * @see #setReceiptsGrandTotalBankable(BigDecimal)
     * @generated
     */
    void unsetReceiptsGrandTotalBankable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipts Grand Total Bankable</em>' attribute is set.
     * @see #unsetReceiptsGrandTotalBankable()
     * @see #getReceiptsGrandTotalBankable()
     * @see #setReceiptsGrandTotalBankable(BigDecimal)
     * @generated
     */
    boolean isSetReceiptsGrandTotalBankable();

    /**
     * Returns the value of the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipts Grand Total Non Bankable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
     * @see #isSetReceiptsGrandTotalNonBankable()
     * @see #unsetReceiptsGrandTotalNonBankable()
     * @see #setReceiptsGrandTotalNonBankable(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_ReceiptsGrandTotalNonBankable()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.receiptsGrandTotalNonBankable' kind='element'"
     * @generated
     */
    BigDecimal getReceiptsGrandTotalNonBankable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
     * @see #isSetReceiptsGrandTotalNonBankable()
     * @see #unsetReceiptsGrandTotalNonBankable()
     * @see #getReceiptsGrandTotalNonBankable()
     * @generated
     */
    void setReceiptsGrandTotalNonBankable( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiptsGrandTotalNonBankable()
     * @see #getReceiptsGrandTotalNonBankable()
     * @see #setReceiptsGrandTotalNonBankable(BigDecimal)
     * @generated
     */
    void unsetReceiptsGrandTotalNonBankable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipts Grand Total Non Bankable</em>' attribute is set.
     * @see #unsetReceiptsGrandTotalNonBankable()
     * @see #getReceiptsGrandTotalNonBankable()
     * @see #setReceiptsGrandTotalNonBankable(BigDecimal)
     * @generated
     */
    boolean isSetReceiptsGrandTotalNonBankable();

    /**
     * Returns the value of the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipts Grand Total Rounding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipts Grand Total Rounding</em>' attribute.
     * @see #isSetReceiptsGrandTotalRounding()
     * @see #unsetReceiptsGrandTotalRounding()
     * @see #setReceiptsGrandTotalRounding(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_ReceiptsGrandTotalRounding()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.receiptsGrandTotalRounding' kind='element'"
     * @generated
     */
    BigDecimal getReceiptsGrandTotalRounding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receipts Grand Total Rounding</em>' attribute.
     * @see #isSetReceiptsGrandTotalRounding()
     * @see #unsetReceiptsGrandTotalRounding()
     * @see #getReceiptsGrandTotalRounding()
     * @generated
     */
    void setReceiptsGrandTotalRounding( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiptsGrandTotalRounding()
     * @see #getReceiptsGrandTotalRounding()
     * @see #setReceiptsGrandTotalRounding(BigDecimal)
     * @generated
     */
    void unsetReceiptsGrandTotalRounding();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipts Grand Total Rounding</em>' attribute is set.
     * @see #unsetReceiptsGrandTotalRounding()
     * @see #getReceiptsGrandTotalRounding()
     * @see #setReceiptsGrandTotalRounding(BigDecimal)
     * @generated
     */
    boolean isSetReceiptsGrandTotalRounding();

    /**
     * Returns the value of the '<em><b>Transactions Grand Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions Grand Total</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions Grand Total</em>' attribute.
     * @see #isSetTransactionsGrandTotal()
     * @see #unsetTransactionsGrandTotal()
     * @see #setTransactionsGrandTotal(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_TransactionsGrandTotal()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.transactionsGrandTotal' kind='element'"
     * @generated
     */
    BigDecimal getTransactionsGrandTotal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transactions Grand Total</em>' attribute.
     * @see #isSetTransactionsGrandTotal()
     * @see #unsetTransactionsGrandTotal()
     * @see #getTransactionsGrandTotal()
     * @generated
     */
    void setTransactionsGrandTotal( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactionsGrandTotal()
     * @see #getTransactionsGrandTotal()
     * @see #setTransactionsGrandTotal(BigDecimal)
     * @generated
     */
    void unsetTransactionsGrandTotal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions Grand Total</em>' attribute is set.
     * @see #unsetTransactionsGrandTotal()
     * @see #getTransactionsGrandTotal()
     * @see #setTransactionsGrandTotal(BigDecimal)
     * @generated
     */
    boolean isSetTransactionsGrandTotal();

    /**
     * Returns the value of the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions Grand Total Rounding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions Grand Total Rounding</em>' attribute.
     * @see #isSetTransactionsGrandTotalRounding()
     * @see #unsetTransactionsGrandTotalRounding()
     * @see #setTransactionsGrandTotalRounding(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_TransactionsGrandTotalRounding()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.transactionsGrandTotalRounding' kind='element'"
     * @generated
     */
    BigDecimal getTransactionsGrandTotalRounding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transactions Grand Total Rounding</em>' attribute.
     * @see #isSetTransactionsGrandTotalRounding()
     * @see #unsetTransactionsGrandTotalRounding()
     * @see #getTransactionsGrandTotalRounding()
     * @generated
     */
    void setTransactionsGrandTotalRounding( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactionsGrandTotalRounding()
     * @see #getTransactionsGrandTotalRounding()
     * @see #setTransactionsGrandTotalRounding(BigDecimal)
     * @generated
     */
    void unsetTransactionsGrandTotalRounding();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions Grand Total Rounding</em>' attribute is set.
     * @see #unsetTransactionsGrandTotalRounding()
     * @see #getTransactionsGrandTotalRounding()
     * @see #setTransactionsGrandTotalRounding(BigDecimal)
     * @generated
     */
    boolean isSetTransactionsGrandTotalRounding();

    /**
     * Returns the value of the '<em><b>Activity Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Interval</em>' containment reference.
     * @see #isSetActivityInterval()
     * @see #unsetActivityInterval()
     * @see #setActivityInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShift_ActivityInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Shift.activityInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getActivityInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getActivityInterval <em>Activity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Interval</em>' containment reference.
     * @see #isSetActivityInterval()
     * @see #unsetActivityInterval()
     * @see #getActivityInterval()
     * @generated
     */
    void setActivityInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getActivityInterval <em>Activity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActivityInterval()
     * @see #getActivityInterval()
     * @see #setActivityInterval(DateTimeInterval)
     * @generated
     */
    void unsetActivityInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift#getActivityInterval <em>Activity Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Activity Interval</em>' containment reference is set.
     * @see #unsetActivityInterval()
     * @see #getActivityInterval()
     * @see #setActivityInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetActivityInterval();

} // Shift
