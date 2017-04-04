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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getReversible <em>Reversible</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr1 <em>Rr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr2 <em>Rr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr1 <em>Xlr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr2 <em>Xlr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXm <em>Xm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXpp <em>Xpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXs <em>Xs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine()
 * @model
 * @generated
 */
public interface AsynchronousMachine extends RotatingMachine {
    /**
     * Returns the value of the '<em><b>Asynchronous Machine Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asynchronous Machine Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asynchronous Machine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineKind
     * @see #isSetAsynchronousMachineType()
     * @see #unsetAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_AsynchronousMachineType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.asynchronousMachineType' kind='element'"
     * @generated
     */
    AsynchronousMachineKind getAsynchronousMachineType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineKind
     * @see #isSetAsynchronousMachineType()
     * @see #unsetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @generated
     */
    void setAsynchronousMachineType( AsynchronousMachineKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @generated
     */
    void unsetAsynchronousMachineType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Type</em>' attribute is set.
     * @see #unsetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @generated
     */
    boolean isSetAsynchronousMachineType();

    /**
     * Returns the value of the '<em><b>Converter Fed Drive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Converter Fed Drive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Converter Fed Drive</em>' attribute.
     * @see #isSetConverterFedDrive()
     * @see #unsetConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_ConverterFedDrive()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.converterFedDrive' kind='element'"
     * @generated
     */
    Boolean getConverterFedDrive();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Converter Fed Drive</em>' attribute.
     * @see #isSetConverterFedDrive()
     * @see #unsetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @generated
     */
    void setConverterFedDrive( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @generated
     */
    void unsetConverterFedDrive();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Converter Fed Drive</em>' attribute is set.
     * @see #unsetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @generated
     */
    boolean isSetConverterFedDrive();

    /**
     * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #setEfficiency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Efficiency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.efficiency' kind='element'"
     * @generated
     */
    Float getEfficiency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @generated
     */
    void setEfficiency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Float)
     * @generated
     */
    void unsetEfficiency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efficiency</em>' attribute is set.
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Float)
     * @generated
     */
    boolean isSetEfficiency();

    /**
     * Returns the value of the '<em><b>Ia Ir Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ia Ir Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ia Ir Ratio</em>' attribute.
     * @see #isSetIaIrRatio()
     * @see #unsetIaIrRatio()
     * @see #setIaIrRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_IaIrRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.iaIrRatio' kind='element'"
     * @generated
     */
    Float getIaIrRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ia Ir Ratio</em>' attribute.
     * @see #isSetIaIrRatio()
     * @see #unsetIaIrRatio()
     * @see #getIaIrRatio()
     * @generated
     */
    void setIaIrRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIaIrRatio()
     * @see #getIaIrRatio()
     * @see #setIaIrRatio(Float)
     * @generated
     */
    void unsetIaIrRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ia Ir Ratio</em>' attribute is set.
     * @see #unsetIaIrRatio()
     * @see #getIaIrRatio()
     * @see #setIaIrRatio(Float)
     * @generated
     */
    boolean isSetIaIrRatio();

    /**
     * Returns the value of the '<em><b>Nominal Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal Frequency</em>' attribute.
     * @see #isSetNominalFrequency()
     * @see #unsetNominalFrequency()
     * @see #setNominalFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_NominalFrequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.nominalFrequency' kind='element'"
     * @generated
     */
    Float getNominalFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Frequency</em>' attribute.
     * @see #isSetNominalFrequency()
     * @see #unsetNominalFrequency()
     * @see #getNominalFrequency()
     * @generated
     */
    void setNominalFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalFrequency()
     * @see #getNominalFrequency()
     * @see #setNominalFrequency(Float)
     * @generated
     */
    void unsetNominalFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Frequency</em>' attribute is set.
     * @see #unsetNominalFrequency()
     * @see #getNominalFrequency()
     * @see #setNominalFrequency(Float)
     * @generated
     */
    boolean isSetNominalFrequency();

    /**
     * Returns the value of the '<em><b>Nominal Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal Speed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal Speed</em>' attribute.
     * @see #isSetNominalSpeed()
     * @see #unsetNominalSpeed()
     * @see #setNominalSpeed(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_NominalSpeed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.nominalSpeed' kind='element'"
     * @generated
     */
    Float getNominalSpeed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Speed</em>' attribute.
     * @see #isSetNominalSpeed()
     * @see #unsetNominalSpeed()
     * @see #getNominalSpeed()
     * @generated
     */
    void setNominalSpeed( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalSpeed()
     * @see #getNominalSpeed()
     * @see #setNominalSpeed(Float)
     * @generated
     */
    void unsetNominalSpeed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Speed</em>' attribute is set.
     * @see #unsetNominalSpeed()
     * @see #getNominalSpeed()
     * @see #setNominalSpeed(Float)
     * @generated
     */
    boolean isSetNominalSpeed();

    /**
     * Returns the value of the '<em><b>Pole Pair Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pole Pair Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pole Pair Number</em>' attribute.
     * @see #isSetPolePairNumber()
     * @see #unsetPolePairNumber()
     * @see #setPolePairNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_PolePairNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.polePairNumber' kind='element'"
     * @generated
     */
    Integer getPolePairNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pole Pair Number</em>' attribute.
     * @see #isSetPolePairNumber()
     * @see #unsetPolePairNumber()
     * @see #getPolePairNumber()
     * @generated
     */
    void setPolePairNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPolePairNumber()
     * @see #getPolePairNumber()
     * @see #setPolePairNumber(Integer)
     * @generated
     */
    void unsetPolePairNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pole Pair Number</em>' attribute is set.
     * @see #unsetPolePairNumber()
     * @see #getPolePairNumber()
     * @see #setPolePairNumber(Integer)
     * @generated
     */
    boolean isSetPolePairNumber();

    /**
     * Returns the value of the '<em><b>Rated Mechanical Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Mechanical Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Mechanical Power</em>' attribute.
     * @see #isSetRatedMechanicalPower()
     * @see #unsetRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_RatedMechanicalPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.ratedMechanicalPower' kind='element'"
     * @generated
     */
    Float getRatedMechanicalPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Mechanical Power</em>' attribute.
     * @see #isSetRatedMechanicalPower()
     * @see #unsetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @generated
     */
    void setRatedMechanicalPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Float)
     * @generated
     */
    void unsetRatedMechanicalPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Mechanical Power</em>' attribute is set.
     * @see #unsetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Float)
     * @generated
     */
    boolean isSetRatedMechanicalPower();

    /**
     * Returns the value of the '<em><b>Reversible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reversible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reversible</em>' attribute.
     * @see #isSetReversible()
     * @see #unsetReversible()
     * @see #setReversible(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Reversible()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.reversible' kind='element'"
     * @generated
     */
    Boolean getReversible();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reversible</em>' attribute.
     * @see #isSetReversible()
     * @see #unsetReversible()
     * @see #getReversible()
     * @generated
     */
    void setReversible( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReversible()
     * @see #getReversible()
     * @see #setReversible(Boolean)
     * @generated
     */
    void unsetReversible();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reversible</em>' attribute is set.
     * @see #unsetReversible()
     * @see #getReversible()
     * @see #setReversible(Boolean)
     * @generated
     */
    boolean isSetReversible();

    /**
     * Returns the value of the '<em><b>Rr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rr1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #setRr1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Rr1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.rr1' kind='element'"
     * @generated
     */
    Float getRr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #getRr1()
     * @generated
     */
    void setRr1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr1()
     * @see #getRr1()
     * @see #setRr1(Float)
     * @generated
     */
    void unsetRr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr1 <em>Rr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr1</em>' attribute is set.
     * @see #unsetRr1()
     * @see #getRr1()
     * @see #setRr1(Float)
     * @generated
     */
    boolean isSetRr1();

    /**
     * Returns the value of the '<em><b>Rr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rr2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #setRr2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Rr2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.rr2' kind='element'"
     * @generated
     */
    Float getRr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #getRr2()
     * @generated
     */
    void setRr2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr2()
     * @see #getRr2()
     * @see #setRr2(Float)
     * @generated
     */
    void unsetRr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRr2 <em>Rr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr2</em>' attribute is set.
     * @see #unsetRr2()
     * @see #getRr2()
     * @see #setRr2(Float)
     * @generated
     */
    boolean isSetRr2();

    /**
     * Returns the value of the '<em><b>Rx Locked Rotor Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx Locked Rotor Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx Locked Rotor Ratio</em>' attribute.
     * @see #isSetRxLockedRotorRatio()
     * @see #unsetRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_RxLockedRotorRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.rxLockedRotorRatio' kind='element'"
     * @generated
     */
    Float getRxLockedRotorRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx Locked Rotor Ratio</em>' attribute.
     * @see #isSetRxLockedRotorRatio()
     * @see #unsetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @generated
     */
    void setRxLockedRotorRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Float)
     * @generated
     */
    void unsetRxLockedRotorRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rx Locked Rotor Ratio</em>' attribute is set.
     * @see #unsetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Float)
     * @generated
     */
    boolean isSetRxLockedRotorRatio();

    /**
     * Returns the value of the '<em><b>Tpo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #setTpo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Tpo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.tpo' kind='element'"
     * @generated
     */
    Float getTpo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #getTpo()
     * @generated
     */
    void setTpo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    void unsetTpo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTpo <em>Tpo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpo</em>' attribute is set.
     * @see #unsetTpo()
     * @see #getTpo()
     * @see #setTpo(Float)
     * @generated
     */
    boolean isSetTpo();

    /**
     * Returns the value of the '<em><b>Tppo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tppo</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #setTppo(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Tppo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.tppo' kind='element'"
     * @generated
     */
    Float getTppo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #getTppo()
     * @generated
     */
    void setTppo( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    void unsetTppo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getTppo <em>Tppo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppo</em>' attribute is set.
     * @see #unsetTppo()
     * @see #getTppo()
     * @see #setTppo(Float)
     * @generated
     */
    boolean isSetTppo();

    /**
     * Returns the value of the '<em><b>Xlr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xlr1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #setXlr1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xlr1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xlr1' kind='element'"
     * @generated
     */
    Float getXlr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @generated
     */
    void setXlr1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Float)
     * @generated
     */
    void unsetXlr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr1 <em>Xlr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr1</em>' attribute is set.
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Float)
     * @generated
     */
    boolean isSetXlr1();

    /**
     * Returns the value of the '<em><b>Xlr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xlr2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #setXlr2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xlr2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xlr2' kind='element'"
     * @generated
     */
    Float getXlr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @generated
     */
    void setXlr2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Float)
     * @generated
     */
    void unsetXlr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXlr2 <em>Xlr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr2</em>' attribute is set.
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Float)
     * @generated
     */
    boolean isSetXlr2();

    /**
     * Returns the value of the '<em><b>Xm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #setXm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xm' kind='element'"
     * @generated
     */
    Float getXm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #getXm()
     * @generated
     */
    void setXm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXm()
     * @see #getXm()
     * @see #setXm(Float)
     * @generated
     */
    void unsetXm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXm <em>Xm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xm</em>' attribute is set.
     * @see #unsetXm()
     * @see #getXm()
     * @see #setXm(Float)
     * @generated
     */
    boolean isSetXm();

    /**
     * Returns the value of the '<em><b>Xp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #setXp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xp' kind='element'"
     * @generated
     */
    Float getXp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #getXp()
     * @generated
     */
    void setXp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXp()
     * @see #getXp()
     * @see #setXp(Float)
     * @generated
     */
    void unsetXp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXp <em>Xp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xp</em>' attribute is set.
     * @see #unsetXp()
     * @see #getXp()
     * @see #setXp(Float)
     * @generated
     */
    boolean isSetXp();

    /**
     * Returns the value of the '<em><b>Xpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #setXpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xpp' kind='element'"
     * @generated
     */
    Float getXpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #getXpp()
     * @generated
     */
    void setXpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXpp()
     * @see #getXpp()
     * @see #setXpp(Float)
     * @generated
     */
    void unsetXpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXpp <em>Xpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xpp</em>' attribute is set.
     * @see #unsetXpp()
     * @see #getXpp()
     * @see #setXpp(Float)
     * @generated
     */
    boolean isSetXpp();

    /**
     * Returns the value of the '<em><b>Xs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #setXs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_Xs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.xs' kind='element'"
     * @generated
     */
    Float getXs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #getXs()
     * @generated
     */
    void setXs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXs()
     * @see #getXs()
     * @see #setXs(Float)
     * @generated
     */
    void unsetXs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getXs <em>Xs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xs</em>' attribute is set.
     * @see #unsetXs()
     * @see #getXs()
     * @see #setXs(Float)
     * @generated
     */
    boolean isSetXs();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asynchronous Machine Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachine_AsynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine
     * @model opposite="AsynchronousMachine" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachine.AsynchronousMachineDynamics' kind='element'"
     * @generated
     */
    AsynchronousMachineDynamics getAsynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @generated
     */
    void setAsynchronousMachineDynamics( AsynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    void unsetAsynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Dynamics</em>' reference is set.
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    boolean isSetAsynchronousMachineDynamics();

} // AsynchronousMachine
