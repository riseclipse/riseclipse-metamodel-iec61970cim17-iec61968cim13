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
 * A representation of the model object '<em><b>Periodic Statistical Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalMagnitude <em>Calculation Interval Magnitude</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalUnit <em>Calculation Interval Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPeriodicStatisticalCalculation()
 * @model
 * @generated
 */
public interface PeriodicStatisticalCalculation extends StatisticalCalculation {
    /**
     * Returns the value of the '<em><b>Calculation Interval Magnitude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Interval Magnitude</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Interval Magnitude</em>' attribute.
     * @see #isSetCalculationIntervalMagnitude()
     * @see #unsetCalculationIntervalMagnitude()
     * @see #setCalculationIntervalMagnitude(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPeriodicStatisticalCalculation_CalculationIntervalMagnitude()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PeriodicStatisticalCalculation.calculationIntervalMagnitude' kind='element'"
     * @generated
     */
    Integer getCalculationIntervalMagnitude();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalMagnitude <em>Calculation Interval Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Interval Magnitude</em>' attribute.
     * @see #isSetCalculationIntervalMagnitude()
     * @see #unsetCalculationIntervalMagnitude()
     * @see #getCalculationIntervalMagnitude()
     * @generated
     */
    void setCalculationIntervalMagnitude( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalMagnitude <em>Calculation Interval Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationIntervalMagnitude()
     * @see #getCalculationIntervalMagnitude()
     * @see #setCalculationIntervalMagnitude(Integer)
     * @generated
     */
    void unsetCalculationIntervalMagnitude();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalMagnitude <em>Calculation Interval Magnitude</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Interval Magnitude</em>' attribute is set.
     * @see #unsetCalculationIntervalMagnitude()
     * @see #getCalculationIntervalMagnitude()
     * @see #setCalculationIntervalMagnitude(Integer)
     * @generated
     */
    boolean isSetCalculationIntervalMagnitude();

    /**
     * Returns the value of the '<em><b>Calculation Interval Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationIntervalUnitKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Interval Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Interval Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationIntervalUnitKind
     * @see #isSetCalculationIntervalUnit()
     * @see #unsetCalculationIntervalUnit()
     * @see #setCalculationIntervalUnit(CalculationIntervalUnitKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPeriodicStatisticalCalculation_CalculationIntervalUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PeriodicStatisticalCalculation.calculationIntervalUnit' kind='element'"
     * @generated
     */
    CalculationIntervalUnitKind getCalculationIntervalUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalUnit <em>Calculation Interval Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Interval Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationIntervalUnitKind
     * @see #isSetCalculationIntervalUnit()
     * @see #unsetCalculationIntervalUnit()
     * @see #getCalculationIntervalUnit()
     * @generated
     */
    void setCalculationIntervalUnit( CalculationIntervalUnitKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalUnit <em>Calculation Interval Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationIntervalUnit()
     * @see #getCalculationIntervalUnit()
     * @see #setCalculationIntervalUnit(CalculationIntervalUnitKind)
     * @generated
     */
    void unsetCalculationIntervalUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation#getCalculationIntervalUnit <em>Calculation Interval Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Interval Unit</em>' attribute is set.
     * @see #unsetCalculationIntervalUnit()
     * @see #getCalculationIntervalUnit()
     * @see #setCalculationIntervalUnit(CalculationIntervalUnitKind)
     * @generated
     */
    boolean isSetCalculationIntervalUnit();

} // PeriodicStatisticalCalculation
