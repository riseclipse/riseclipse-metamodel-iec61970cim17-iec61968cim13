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
 * A representation of the model object '<em><b>Pending Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getMultiplyBeforeAdd <em>Multiply Before Add</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarFloat <em>Scalar Float</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation()
 * @model
 * @generated
 */
public interface PendingCalculation extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Multiply Before Add</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiply Before Add</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiply Before Add</em>' attribute.
     * @see #isSetMultiplyBeforeAdd()
     * @see #unsetMultiplyBeforeAdd()
     * @see #setMultiplyBeforeAdd(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_MultiplyBeforeAdd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.multiplyBeforeAdd' kind='element'"
     * @generated
     */
    Boolean getMultiplyBeforeAdd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiply Before Add</em>' attribute.
     * @see #isSetMultiplyBeforeAdd()
     * @see #unsetMultiplyBeforeAdd()
     * @see #getMultiplyBeforeAdd()
     * @generated
     */
    void setMultiplyBeforeAdd( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMultiplyBeforeAdd()
     * @see #getMultiplyBeforeAdd()
     * @see #setMultiplyBeforeAdd(Boolean)
     * @generated
     */
    void unsetMultiplyBeforeAdd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiply Before Add</em>' attribute is set.
     * @see #unsetMultiplyBeforeAdd()
     * @see #getMultiplyBeforeAdd()
     * @see #setMultiplyBeforeAdd(Boolean)
     * @generated
     */
    boolean isSetMultiplyBeforeAdd();

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #isSetOffset()
     * @see #unsetOffset()
     * @see #setOffset(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_Offset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.offset' kind='element'"
     * @generated
     */
    Integer getOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #isSetOffset()
     * @see #unsetOffset()
     * @see #getOffset()
     * @generated
     */
    void setOffset( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffset()
     * @see #getOffset()
     * @see #setOffset(Integer)
     * @generated
     */
    void unsetOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getOffset <em>Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset</em>' attribute is set.
     * @see #unsetOffset()
     * @see #getOffset()
     * @see #setOffset(Integer)
     * @generated
     */
    boolean isSetOffset();

    /**
     * Returns the value of the '<em><b>Scalar Denominator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scalar Denominator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scalar Denominator</em>' attribute.
     * @see #isSetScalarDenominator()
     * @see #unsetScalarDenominator()
     * @see #setScalarDenominator(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_ScalarDenominator()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.scalarDenominator' kind='element'"
     * @generated
     */
    Integer getScalarDenominator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scalar Denominator</em>' attribute.
     * @see #isSetScalarDenominator()
     * @see #unsetScalarDenominator()
     * @see #getScalarDenominator()
     * @generated
     */
    void setScalarDenominator( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScalarDenominator()
     * @see #getScalarDenominator()
     * @see #setScalarDenominator(Integer)
     * @generated
     */
    void unsetScalarDenominator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scalar Denominator</em>' attribute is set.
     * @see #unsetScalarDenominator()
     * @see #getScalarDenominator()
     * @see #setScalarDenominator(Integer)
     * @generated
     */
    boolean isSetScalarDenominator();

    /**
     * Returns the value of the '<em><b>Scalar Float</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scalar Float</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scalar Float</em>' attribute.
     * @see #isSetScalarFloat()
     * @see #unsetScalarFloat()
     * @see #setScalarFloat(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_ScalarFloat()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.scalarFloat' kind='element'"
     * @generated
     */
    Float getScalarFloat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scalar Float</em>' attribute.
     * @see #isSetScalarFloat()
     * @see #unsetScalarFloat()
     * @see #getScalarFloat()
     * @generated
     */
    void setScalarFloat( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScalarFloat()
     * @see #getScalarFloat()
     * @see #setScalarFloat(Float)
     * @generated
     */
    void unsetScalarFloat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scalar Float</em>' attribute is set.
     * @see #unsetScalarFloat()
     * @see #getScalarFloat()
     * @see #setScalarFloat(Float)
     * @generated
     */
    boolean isSetScalarFloat();

    /**
     * Returns the value of the '<em><b>Scalar Numerator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scalar Numerator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scalar Numerator</em>' attribute.
     * @see #isSetScalarNumerator()
     * @see #unsetScalarNumerator()
     * @see #setScalarNumerator(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_ScalarNumerator()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.scalarNumerator' kind='element'"
     * @generated
     */
    Integer getScalarNumerator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scalar Numerator</em>' attribute.
     * @see #isSetScalarNumerator()
     * @see #unsetScalarNumerator()
     * @see #getScalarNumerator()
     * @generated
     */
    void setScalarNumerator( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScalarNumerator()
     * @see #getScalarNumerator()
     * @see #setScalarNumerator(Integer)
     * @generated
     */
    void unsetScalarNumerator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scalar Numerator</em>' attribute is set.
     * @see #unsetScalarNumerator()
     * @see #getScalarNumerator()
     * @see #setScalarNumerator(Integer)
     * @generated
     */
    boolean isSetScalarNumerator();

    /**
     * Returns the value of the '<em><b>Reading Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getPendingCalculation <em>Pending Calculation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reading Type</em>' reference.
     * @see #isSetReadingType()
     * @see #unsetReadingType()
     * @see #setReadingType(ReadingType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_ReadingType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getPendingCalculation
     * @model opposite="PendingCalculation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.ReadingType' kind='element'"
     * @generated
     */
    ReadingType getReadingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getReadingType <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reading Type</em>' reference.
     * @see #isSetReadingType()
     * @see #unsetReadingType()
     * @see #getReadingType()
     * @generated
     */
    void setReadingType( ReadingType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getReadingType <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadingType()
     * @see #getReadingType()
     * @see #setReadingType(ReadingType)
     * @generated
     */
    void unsetReadingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getReadingType <em>Reading Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reading Type</em>' reference is set.
     * @see #unsetReadingType()
     * @see #getReadingType()
     * @see #setReadingType(ReadingType)
     * @generated
     */
    boolean isSetReadingType();

    /**
     * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval Blocks</em>' reference list.
     * @see #isSetIntervalBlocks()
     * @see #unsetIntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPendingCalculation_IntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation
     * @model opposite="PendingCalculation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PendingCalculation.IntervalBlocks' kind='element'"
     * @generated
     */
    EList< IntervalBlock > getIntervalBlocks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    void unsetIntervalBlocks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Blocks</em>' reference list is set.
     * @see #unsetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    boolean isSetIntervalBlocks();

} // PendingCalculation
