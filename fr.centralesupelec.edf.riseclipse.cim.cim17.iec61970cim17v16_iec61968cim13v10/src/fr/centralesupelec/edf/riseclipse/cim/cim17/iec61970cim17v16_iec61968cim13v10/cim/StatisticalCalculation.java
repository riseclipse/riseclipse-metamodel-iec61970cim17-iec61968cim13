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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistical Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMode <em>Calculation Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationTechnique <em>Calculation Technique</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMethodOrder <em>Calculation Method Order</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStatisticalCalculation()
 * @model
 * @generated
 */
public interface StatisticalCalculation extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Calculation Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationModeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationModeKind
     * @see #isSetCalculationMode()
     * @see #unsetCalculationMode()
     * @see #setCalculationMode(CalculationModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStatisticalCalculation_CalculationMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StatisticalCalculation.calculationMode' kind='element'"
     * @generated
     */
    CalculationModeKind getCalculationMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMode <em>Calculation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationModeKind
     * @see #isSetCalculationMode()
     * @see #unsetCalculationMode()
     * @see #getCalculationMode()
     * @generated
     */
    void setCalculationMode( CalculationModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMode <em>Calculation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationMode()
     * @see #getCalculationMode()
     * @see #setCalculationMode(CalculationModeKind)
     * @generated
     */
    void unsetCalculationMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMode <em>Calculation Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Mode</em>' attribute is set.
     * @see #unsetCalculationMode()
     * @see #getCalculationMode()
     * @see #setCalculationMode(CalculationModeKind)
     * @generated
     */
    boolean isSetCalculationMode();

    /**
     * Returns the value of the '<em><b>Calculation Technique</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationTechniqueKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Technique</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Technique</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationTechniqueKind
     * @see #isSetCalculationTechnique()
     * @see #unsetCalculationTechnique()
     * @see #setCalculationTechnique(CalculationTechniqueKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStatisticalCalculation_CalculationTechnique()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StatisticalCalculation.calculationTechnique' kind='element'"
     * @generated
     */
    CalculationTechniqueKind getCalculationTechnique();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationTechnique <em>Calculation Technique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Technique</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationTechniqueKind
     * @see #isSetCalculationTechnique()
     * @see #unsetCalculationTechnique()
     * @see #getCalculationTechnique()
     * @generated
     */
    void setCalculationTechnique( CalculationTechniqueKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationTechnique <em>Calculation Technique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationTechnique()
     * @see #getCalculationTechnique()
     * @see #setCalculationTechnique(CalculationTechniqueKind)
     * @generated
     */
    void unsetCalculationTechnique();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationTechnique <em>Calculation Technique</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Technique</em>' attribute is set.
     * @see #unsetCalculationTechnique()
     * @see #getCalculationTechnique()
     * @see #setCalculationTechnique(CalculationTechniqueKind)
     * @generated
     */
    boolean isSetCalculationTechnique();

    /**
     * Returns the value of the '<em><b>Calculation Method Order</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation <em>Statisical Calculation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Method Order</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Method Order</em>' reference list.
     * @see #isSetCalculationMethodOrder()
     * @see #unsetCalculationMethodOrder()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStatisticalCalculation_CalculationMethodOrder()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getStatisicalCalculation
     * @model opposite="StatisicalCalculation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StatisticalCalculation.CalculationMethodOrder' kind='element'"
     * @generated
     */
    EList< CalculationMethodOrder > getCalculationMethodOrder();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMethodOrder <em>Calculation Method Order</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationMethodOrder()
     * @see #getCalculationMethodOrder()
     * @generated
     */
    void unsetCalculationMethodOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation#getCalculationMethodOrder <em>Calculation Method Order</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Method Order</em>' reference list is set.
     * @see #unsetCalculationMethodOrder()
     * @see #getCalculationMethodOrder()
     * @generated
     */
    boolean isSetCalculationMethodOrder();

} // StatisticalCalculation
