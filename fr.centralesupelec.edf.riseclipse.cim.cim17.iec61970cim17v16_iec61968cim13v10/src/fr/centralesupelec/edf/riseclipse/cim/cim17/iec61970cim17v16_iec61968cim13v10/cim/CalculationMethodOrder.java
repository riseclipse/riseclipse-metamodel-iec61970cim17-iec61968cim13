/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Method Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getOrder <em>Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation <em>Statisical Calculation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodOrder()
 * @model
 * @generated
 */
public interface CalculationMethodOrder extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order</em>' attribute.
     * @see #isSetOrder()
     * @see #unsetOrder()
     * @see #setOrder(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodOrder_Order()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodOrder.order' kind='element'"
     * @generated
     */
    Integer getOrder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order</em>' attribute.
     * @see #isSetOrder()
     * @see #unsetOrder()
     * @see #getOrder()
     * @generated
     */
    void setOrder( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrder()
     * @see #getOrder()
     * @see #setOrder(Integer)
     * @generated
     */
    void unsetOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getOrder <em>Order</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Order</em>' attribute is set.
     * @see #unsetOrder()
     * @see #getOrder()
     * @see #setOrder(Integer)
     * @generated
     */
    boolean isSetOrder();

    /**
     * Returns the value of the '<em><b>Calculation Method Hierarchy</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getCalculationMethodOrder <em>Calculation Method Order</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Method Hierarchy</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Method Hierarchy</em>' reference.
     * @see #isSetCalculationMethodHierarchy()
     * @see #unsetCalculationMethodHierarchy()
     * @see #setCalculationMethodHierarchy(CalculationMethodHierarchy)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodOrder_CalculationMethodHierarchy()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getCalculationMethodOrder
     * @model opposite="CalculationMethodOrder" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodOrder.CalculationMethodHierarchy' kind='element'"
     * @generated
     */
    CalculationMethodHierarchy getCalculationMethodHierarchy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Method Hierarchy</em>' reference.
     * @see #isSetCalculationMethodHierarchy()
     * @see #unsetCalculationMethodHierarchy()
     * @see #getCalculationMethodHierarchy()
     * @generated
     */
    void setCalculationMethodHierarchy( CalculationMethodHierarchy value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationMethodHierarchy()
     * @see #getCalculationMethodHierarchy()
     * @see #setCalculationMethodHierarchy(CalculationMethodHierarchy)
     * @generated
     */
    void unsetCalculationMethodHierarchy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Method Hierarchy</em>' reference is set.
     * @see #unsetCalculationMethodHierarchy()
     * @see #getCalculationMethodHierarchy()
     * @see #setCalculationMethodHierarchy(CalculationMethodHierarchy)
     * @generated
     */
    boolean isSetCalculationMethodHierarchy();

    /**
     * Returns the value of the '<em><b>Statisical Calculation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMethodOrder <em>Calculation Method Order</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statisical Calculation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statisical Calculation</em>' reference.
     * @see #isSetStatisicalCalculation()
     * @see #unsetStatisicalCalculation()
     * @see #setStatisicalCalculation(StatisticalCalculation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodOrder_StatisicalCalculation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMethodOrder
     * @model opposite="CalculationMethodOrder" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodOrder.StatisicalCalculation' kind='element'"
     * @generated
     */
    StatisticalCalculation getStatisicalCalculation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation <em>Statisical Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statisical Calculation</em>' reference.
     * @see #isSetStatisicalCalculation()
     * @see #unsetStatisicalCalculation()
     * @see #getStatisicalCalculation()
     * @generated
     */
    void setStatisicalCalculation( StatisticalCalculation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation <em>Statisical Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatisicalCalculation()
     * @see #getStatisicalCalculation()
     * @see #setStatisicalCalculation(StatisticalCalculation)
     * @generated
     */
    void unsetStatisicalCalculation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation <em>Statisical Calculation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Statisical Calculation</em>' reference is set.
     * @see #unsetStatisicalCalculation()
     * @see #getStatisicalCalculation()
     * @see #setStatisicalCalculation(StatisticalCalculation)
     * @generated
     */
    boolean isSetStatisicalCalculation();

} // CalculationMethodOrder
