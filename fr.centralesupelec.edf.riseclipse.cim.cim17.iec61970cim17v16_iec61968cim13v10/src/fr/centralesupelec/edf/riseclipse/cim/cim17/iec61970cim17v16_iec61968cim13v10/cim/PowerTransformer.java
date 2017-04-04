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
 * A representation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getVectorGroup <em>Vector Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer()
 * @model
 * @generated
 */
public interface PowerTransformer extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Before Sh Circuit Highest Operating Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_BeforeShCircuitHighestOperatingCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.beforeShCircuitHighestOperatingCurrent' kind='element'"
     * @generated
     */
    Float getBeforeShCircuitHighestOperatingCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     */
    void setBeforeShCircuitHighestOperatingCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Float)
     * @generated
     */
    void unsetBeforeShCircuitHighestOperatingCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute is set.
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Float)
     * @generated
     */
    boolean isSetBeforeShCircuitHighestOperatingCurrent();

    /**
     * Returns the value of the '<em><b>Before Sh Circuit Highest Operating Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_BeforeShCircuitHighestOperatingVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.beforeShCircuitHighestOperatingVoltage' kind='element'"
     * @generated
     */
    Float getBeforeShCircuitHighestOperatingVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     */
    void setBeforeShCircuitHighestOperatingVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Float)
     * @generated
     */
    void unsetBeforeShCircuitHighestOperatingVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute is set.
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Float)
     * @generated
     */
    boolean isSetBeforeShCircuitHighestOperatingVoltage();

    /**
     * Returns the value of the '<em><b>Before Short Circuit Angle Pf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Before Short Circuit Angle Pf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Before Short Circuit Angle Pf</em>' attribute.
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_BeforeShortCircuitAnglePf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.beforeShortCircuitAnglePf' kind='element'"
     * @generated
     */
    Float getBeforeShortCircuitAnglePf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Short Circuit Angle Pf</em>' attribute.
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     */
    void setBeforeShortCircuitAnglePf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Float)
     * @generated
     */
    void unsetBeforeShortCircuitAnglePf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Short Circuit Angle Pf</em>' attribute is set.
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Float)
     * @generated
     */
    boolean isSetBeforeShortCircuitAnglePf();

    /**
     * Returns the value of the '<em><b>High Side Min Operating U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Side Min Operating U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Side Min Operating U</em>' attribute.
     * @see #isSetHighSideMinOperatingU()
     * @see #unsetHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_HighSideMinOperatingU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.highSideMinOperatingU' kind='element'"
     * @generated
     */
    Float getHighSideMinOperatingU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Side Min Operating U</em>' attribute.
     * @see #isSetHighSideMinOperatingU()
     * @see #unsetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @generated
     */
    void setHighSideMinOperatingU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Float)
     * @generated
     */
    void unsetHighSideMinOperatingU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Side Min Operating U</em>' attribute is set.
     * @see #unsetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Float)
     * @generated
     */
    boolean isSetHighSideMinOperatingU();

    /**
     * Returns the value of the '<em><b>Is Part Of Generator Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Part Of Generator Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Part Of Generator Unit</em>' attribute.
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_IsPartOfGeneratorUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.isPartOfGeneratorUnit' kind='element'"
     * @generated
     */
    Boolean getIsPartOfGeneratorUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Part Of Generator Unit</em>' attribute.
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     */
    void setIsPartOfGeneratorUnit( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @generated
     */
    void unsetIsPartOfGeneratorUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Part Of Generator Unit</em>' attribute is set.
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @generated
     */
    boolean isSetIsPartOfGeneratorUnit();

    /**
     * Returns the value of the '<em><b>Operational Values Considered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Values Considered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Values Considered</em>' attribute.
     * @see #isSetOperationalValuesConsidered()
     * @see #unsetOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_OperationalValuesConsidered()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.operationalValuesConsidered' kind='element'"
     * @generated
     */
    Boolean getOperationalValuesConsidered();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operational Values Considered</em>' attribute.
     * @see #isSetOperationalValuesConsidered()
     * @see #unsetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @generated
     */
    void setOperationalValuesConsidered( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @generated
     */
    void unsetOperationalValuesConsidered();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Values Considered</em>' attribute is set.
     * @see #unsetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @generated
     */
    boolean isSetOperationalValuesConsidered();

    /**
     * Returns the value of the '<em><b>Vector Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vector Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vector Group</em>' attribute.
     * @see #isSetVectorGroup()
     * @see #unsetVectorGroup()
     * @see #setVectorGroup(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_VectorGroup()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.vectorGroup' kind='element'"
     * @generated
     */
    String getVectorGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vector Group</em>' attribute.
     * @see #isSetVectorGroup()
     * @see #unsetVectorGroup()
     * @see #getVectorGroup()
     * @generated
     */
    void setVectorGroup( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVectorGroup()
     * @see #getVectorGroup()
     * @see #setVectorGroup(String)
     * @generated
     */
    void unsetVectorGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vector Group</em>' attribute is set.
     * @see #unsetVectorGroup()
     * @see #getVectorGroup()
     * @see #setVectorGroup(String)
     * @generated
     */
    boolean isSetVectorGroup();

    /**
     * Returns the value of the '<em><b>Power Transformer End</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer End</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer End</em>' reference list.
     * @see #isSetPowerTransformerEnd()
     * @see #unsetPowerTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_PowerTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer
     * @model opposite="PowerTransformer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.PowerTransformerEnd' kind='element'"
     * @generated
     */
    EList< PowerTransformerEnd > getPowerTransformerEnd();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerTransformerEnd()
     * @see #getPowerTransformerEnd()
     * @generated
     */
    void unsetPowerTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Transformer End</em>' reference list is set.
     * @see #unsetPowerTransformerEnd()
     * @see #getPowerTransformerEnd()
     * @generated
     */
    boolean isSetPowerTransformerEnd();

    /**
     * Returns the value of the '<em><b>Transformer Tanks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTank}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTank#getPowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Tanks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Tanks</em>' reference list.
     * @see #isSetTransformerTanks()
     * @see #unsetTransformerTanks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformer_TransformerTanks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTank#getPowerTransformer
     * @model opposite="PowerTransformer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformer.TransformerTanks' kind='element'"
     * @generated
     */
    EList< TransformerTank > getTransformerTanks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerTanks()
     * @see #getTransformerTanks()
     * @generated
     */
    void unsetTransformerTanks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Tanks</em>' reference list is set.
     * @see #unsetTransformerTanks()
     * @see #getTransformerTanks()
     * @generated
     */
    boolean isSetTransformerTanks();

} // PowerTransformer
