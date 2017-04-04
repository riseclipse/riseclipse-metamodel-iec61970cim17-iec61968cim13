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
 * A representation of the model object '<em><b>Short Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLoss <em>Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getPower <em>Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest()
 * @model
 * @generated
 */
public interface ShortCircuitTest extends TransformerTest {
    /**
     * Returns the value of the '<em><b>Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current</em>' attribute.
     * @see #isSetCurrent()
     * @see #unsetCurrent()
     * @see #setCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_Current()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.current' kind='element'"
     * @generated
     */
    Float getCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getCurrent <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current</em>' attribute.
     * @see #isSetCurrent()
     * @see #unsetCurrent()
     * @see #getCurrent()
     * @generated
     */
    void setCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getCurrent <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrent()
     * @see #getCurrent()
     * @see #setCurrent(Float)
     * @generated
     */
    void unsetCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getCurrent <em>Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current</em>' attribute is set.
     * @see #unsetCurrent()
     * @see #getCurrent()
     * @see #setCurrent(Float)
     * @generated
     */
    boolean isSetCurrent();

    /**
     * Returns the value of the '<em><b>Energised End Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End Step</em>' attribute.
     * @see #isSetEnergisedEndStep()
     * @see #unsetEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_EnergisedEndStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.energisedEndStep' kind='element'"
     * @generated
     */
    Integer getEnergisedEndStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energised End Step</em>' attribute.
     * @see #isSetEnergisedEndStep()
     * @see #unsetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @generated
     */
    void setEnergisedEndStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @generated
     */
    void unsetEnergisedEndStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End Step</em>' attribute is set.
     * @see #unsetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @generated
     */
    boolean isSetEnergisedEndStep();

    /**
     * Returns the value of the '<em><b>Grounded End Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounded End Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounded End Step</em>' attribute.
     * @see #isSetGroundedEndStep()
     * @see #unsetGroundedEndStep()
     * @see #setGroundedEndStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_GroundedEndStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.groundedEndStep' kind='element'"
     * @generated
     */
    Integer getGroundedEndStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounded End Step</em>' attribute.
     * @see #isSetGroundedEndStep()
     * @see #unsetGroundedEndStep()
     * @see #getGroundedEndStep()
     * @generated
     */
    void setGroundedEndStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGroundedEndStep()
     * @see #getGroundedEndStep()
     * @see #setGroundedEndStep(Integer)
     * @generated
     */
    void unsetGroundedEndStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded End Step</em>' attribute is set.
     * @see #unsetGroundedEndStep()
     * @see #getGroundedEndStep()
     * @see #setGroundedEndStep(Integer)
     * @generated
     */
    boolean isSetGroundedEndStep();

    /**
     * Returns the value of the '<em><b>Leakage Impedance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leakage Impedance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leakage Impedance</em>' attribute.
     * @see #isSetLeakageImpedance()
     * @see #unsetLeakageImpedance()
     * @see #setLeakageImpedance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_LeakageImpedance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.leakageImpedance' kind='element'"
     * @generated
     */
    Float getLeakageImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leakage Impedance</em>' attribute.
     * @see #isSetLeakageImpedance()
     * @see #unsetLeakageImpedance()
     * @see #getLeakageImpedance()
     * @generated
     */
    void setLeakageImpedance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLeakageImpedance()
     * @see #getLeakageImpedance()
     * @see #setLeakageImpedance(Float)
     * @generated
     */
    void unsetLeakageImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Leakage Impedance</em>' attribute is set.
     * @see #unsetLeakageImpedance()
     * @see #getLeakageImpedance()
     * @see #setLeakageImpedance(Float)
     * @generated
     */
    boolean isSetLeakageImpedance();

    /**
     * Returns the value of the '<em><b>Leakage Impedance Zero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leakage Impedance Zero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leakage Impedance Zero</em>' attribute.
     * @see #isSetLeakageImpedanceZero()
     * @see #unsetLeakageImpedanceZero()
     * @see #setLeakageImpedanceZero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_LeakageImpedanceZero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.leakageImpedanceZero' kind='element'"
     * @generated
     */
    Float getLeakageImpedanceZero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leakage Impedance Zero</em>' attribute.
     * @see #isSetLeakageImpedanceZero()
     * @see #unsetLeakageImpedanceZero()
     * @see #getLeakageImpedanceZero()
     * @generated
     */
    void setLeakageImpedanceZero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLeakageImpedanceZero()
     * @see #getLeakageImpedanceZero()
     * @see #setLeakageImpedanceZero(Float)
     * @generated
     */
    void unsetLeakageImpedanceZero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Leakage Impedance Zero</em>' attribute is set.
     * @see #unsetLeakageImpedanceZero()
     * @see #getLeakageImpedanceZero()
     * @see #setLeakageImpedanceZero(Float)
     * @generated
     */
    boolean isSetLeakageImpedanceZero();

    /**
     * Returns the value of the '<em><b>Loss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loss</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loss</em>' attribute.
     * @see #isSetLoss()
     * @see #unsetLoss()
     * @see #setLoss(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_Loss()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.loss' kind='element'"
     * @generated
     */
    Float getLoss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLoss <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loss</em>' attribute.
     * @see #isSetLoss()
     * @see #unsetLoss()
     * @see #getLoss()
     * @generated
     */
    void setLoss( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLoss <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoss()
     * @see #getLoss()
     * @see #setLoss(Float)
     * @generated
     */
    void unsetLoss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLoss <em>Loss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Loss</em>' attribute is set.
     * @see #unsetLoss()
     * @see #getLoss()
     * @see #setLoss(Float)
     * @generated
     */
    boolean isSetLoss();

    /**
     * Returns the value of the '<em><b>Loss Zero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loss Zero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loss Zero</em>' attribute.
     * @see #isSetLossZero()
     * @see #unsetLossZero()
     * @see #setLossZero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_LossZero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.lossZero' kind='element'"
     * @generated
     */
    Float getLossZero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loss Zero</em>' attribute.
     * @see #isSetLossZero()
     * @see #unsetLossZero()
     * @see #getLossZero()
     * @generated
     */
    void setLossZero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLossZero()
     * @see #getLossZero()
     * @see #setLossZero(Float)
     * @generated
     */
    void unsetLossZero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Loss Zero</em>' attribute is set.
     * @see #unsetLossZero()
     * @see #getLossZero()
     * @see #setLossZero(Float)
     * @generated
     */
    boolean isSetLossZero();

    /**
     * Returns the value of the '<em><b>Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power</em>' attribute.
     * @see #isSetPower()
     * @see #unsetPower()
     * @see #setPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_Power()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.power' kind='element'"
     * @generated
     */
    Float getPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getPower <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power</em>' attribute.
     * @see #isSetPower()
     * @see #unsetPower()
     * @see #getPower()
     * @generated
     */
    void setPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getPower <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPower()
     * @see #getPower()
     * @see #setPower(Float)
     * @generated
     */
    void unsetPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getPower <em>Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power</em>' attribute is set.
     * @see #unsetPower()
     * @see #getPower()
     * @see #setPower(Float)
     * @generated
     */
    boolean isSetPower();

    /**
     * Returns the value of the '<em><b>Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage</em>' attribute.
     * @see #isSetVoltage()
     * @see #unsetVoltage()
     * @see #setVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_Voltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.voltage' kind='element'"
     * @generated
     */
    Float getVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getVoltage <em>Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage</em>' attribute.
     * @see #isSetVoltage()
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @generated
     */
    void setVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getVoltage <em>Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Float)
     * @generated
     */
    void unsetVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getVoltage <em>Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage</em>' attribute is set.
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Float)
     * @generated
     */
    boolean isSetVoltage();

    /**
     * Returns the value of the '<em><b>Grounded Ends</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounded Ends</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounded Ends</em>' reference list.
     * @see #isSetGroundedEnds()
     * @see #unsetGroundedEnds()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_GroundedEnds()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getGroundedEndShortCircuitTests
     * @model opposite="GroundedEndShortCircuitTests" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.GroundedEnds' kind='element'"
     * @generated
     */
    EList< TransformerEndInfo > getGroundedEnds();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGroundedEnds()
     * @see #getGroundedEnds()
     * @generated
     */
    void unsetGroundedEnds();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded Ends</em>' reference list is set.
     * @see #unsetGroundedEnds()
     * @see #getGroundedEnds()
     * @generated
     */
    boolean isSetGroundedEnds();

    /**
     * Returns the value of the '<em><b>Energised End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End</em>' reference.
     * @see #isSetEnergisedEnd()
     * @see #unsetEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitTest_EnergisedEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndShortCircuitTests
     * @model opposite="EnergisedEndShortCircuitTests" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShortCircuitTest.EnergisedEnd' kind='element'"
     * @generated
     */
    TransformerEndInfo getEnergisedEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energised End</em>' reference.
     * @see #isSetEnergisedEnd()
     * @see #unsetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @generated
     */
    void setEnergisedEnd( TransformerEndInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    void unsetEnergisedEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End</em>' reference is set.
     * @see #unsetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    boolean isSetEnergisedEnd();

} // ShortCircuitTest
