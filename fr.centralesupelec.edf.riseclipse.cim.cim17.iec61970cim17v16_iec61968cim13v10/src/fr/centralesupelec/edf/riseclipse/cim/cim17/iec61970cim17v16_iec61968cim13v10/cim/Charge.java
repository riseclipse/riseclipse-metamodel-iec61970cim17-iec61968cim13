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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getVariablePortion <em>Variable Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getFixedPortion <em>Fixed Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge <em>Parent Charge</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getChildCharges <em>Child Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge()
 * @model
 * @generated
 */
public interface Charge extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChargeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChargeKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(ChargeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.kind' kind='element'"
     * @generated
     */
    ChargeKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChargeKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( ChargeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(ChargeKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(ChargeKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Variable Portion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Portion</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Portion</em>' attribute.
     * @see #isSetVariablePortion()
     * @see #unsetVariablePortion()
     * @see #setVariablePortion(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_VariablePortion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.variablePortion' kind='element'"
     * @generated
     */
    Float getVariablePortion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getVariablePortion <em>Variable Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable Portion</em>' attribute.
     * @see #isSetVariablePortion()
     * @see #unsetVariablePortion()
     * @see #getVariablePortion()
     * @generated
     */
    void setVariablePortion( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getVariablePortion <em>Variable Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariablePortion()
     * @see #getVariablePortion()
     * @see #setVariablePortion(Float)
     * @generated
     */
    void unsetVariablePortion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getVariablePortion <em>Variable Portion</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Portion</em>' attribute is set.
     * @see #unsetVariablePortion()
     * @see #getVariablePortion()
     * @see #setVariablePortion(Float)
     * @generated
     */
    boolean isSetVariablePortion();

    /**
     * Returns the value of the '<em><b>Fixed Portion</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Portion</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Portion</em>' containment reference.
     * @see #isSetFixedPortion()
     * @see #unsetFixedPortion()
     * @see #setFixedPortion(AccountingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_FixedPortion()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.fixedPortion' kind='element'"
     * @generated
     */
    AccountingUnit getFixedPortion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getFixedPortion <em>Fixed Portion</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Portion</em>' containment reference.
     * @see #isSetFixedPortion()
     * @see #unsetFixedPortion()
     * @see #getFixedPortion()
     * @generated
     */
    void setFixedPortion( AccountingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getFixedPortion <em>Fixed Portion</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFixedPortion()
     * @see #getFixedPortion()
     * @see #setFixedPortion(AccountingUnit)
     * @generated
     */
    void unsetFixedPortion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getFixedPortion <em>Fixed Portion</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Portion</em>' containment reference is set.
     * @see #unsetFixedPortion()
     * @see #getFixedPortion()
     * @see #setFixedPortion(AccountingUnit)
     * @generated
     */
    boolean isSetFixedPortion();

    /**
     * Returns the value of the '<em><b>Parent Charge</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getChildCharges <em>Child Charges</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Charge</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Charge</em>' reference.
     * @see #isSetParentCharge()
     * @see #unsetParentCharge()
     * @see #setParentCharge(Charge)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_ParentCharge()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getChildCharges
     * @model opposite="ChildCharges" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.ParentCharge' kind='element'"
     * @generated
     */
    Charge getParentCharge();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge <em>Parent Charge</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Charge</em>' reference.
     * @see #isSetParentCharge()
     * @see #unsetParentCharge()
     * @see #getParentCharge()
     * @generated
     */
    void setParentCharge( Charge value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge <em>Parent Charge</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetParentCharge()
     * @see #getParentCharge()
     * @see #setParentCharge(Charge)
     * @generated
     */
    void unsetParentCharge();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge <em>Parent Charge</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parent Charge</em>' reference is set.
     * @see #unsetParentCharge()
     * @see #getParentCharge()
     * @see #setParentCharge(Charge)
     * @generated
     */
    boolean isSetParentCharge();

    /**
     * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval#getCharges <em>Charges</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
     * @see #isSetTimeTariffIntervals()
     * @see #unsetTimeTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_TimeTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval#getCharges
     * @model opposite="Charges" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.TimeTariffIntervals' kind='element'"
     * @generated
     */
    EList< TimeTariffInterval > getTimeTariffIntervals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeTariffIntervals()
     * @see #getTimeTariffIntervals()
     * @generated
     */
    void unsetTimeTariffIntervals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Tariff Intervals</em>' reference list is set.
     * @see #unsetTimeTariffIntervals()
     * @see #getTimeTariffIntervals()
     * @generated
     */
    boolean isSetTimeTariffIntervals();

    /**
     * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getCharges <em>Charges</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
     * @see #isSetAuxiliaryAccounts()
     * @see #unsetAuxiliaryAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_AuxiliaryAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getCharges
     * @model opposite="Charges" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.AuxiliaryAccounts' kind='element'"
     * @generated
     */
    EList< AuxiliaryAccount > getAuxiliaryAccounts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryAccounts()
     * @see #getAuxiliaryAccounts()
     * @generated
     */
    void unsetAuxiliaryAccounts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Accounts</em>' reference list is set.
     * @see #unsetAuxiliaryAccounts()
     * @see #getAuxiliaryAccounts()
     * @generated
     */
    boolean isSetAuxiliaryAccounts();

    /**
     * Returns the value of the '<em><b>Child Charges</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge <em>Parent Charge</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Charges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Charges</em>' reference list.
     * @see #isSetChildCharges()
     * @see #unsetChildCharges()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_ChildCharges()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getParentCharge
     * @model opposite="ParentCharge" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.ChildCharges' kind='element'"
     * @generated
     */
    EList< Charge > getChildCharges();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getChildCharges <em>Child Charges</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChildCharges()
     * @see #getChildCharges()
     * @generated
     */
    void unsetChildCharges();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getChildCharges <em>Child Charges</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Child Charges</em>' reference list is set.
     * @see #unsetChildCharges()
     * @see #getChildCharges()
     * @generated
     */
    boolean isSetChildCharges();

    /**
     * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval#getCharges <em>Charges</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
     * @see #isSetConsumptionTariffIntervals()
     * @see #unsetConsumptionTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCharge_ConsumptionTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval#getCharges
     * @model opposite="Charges" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Charge.ConsumptionTariffIntervals' kind='element'"
     * @generated
     */
    EList< ConsumptionTariffInterval > getConsumptionTariffIntervals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumptionTariffIntervals()
     * @see #getConsumptionTariffIntervals()
     * @generated
     */
    void unsetConsumptionTariffIntervals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumption Tariff Intervals</em>' reference list is set.
     * @see #unsetConsumptionTariffIntervals()
     * @see #getConsumptionTariffIntervals()
     * @generated
     */
    boolean isSetConsumptionTariffIntervals();

} // Charge
