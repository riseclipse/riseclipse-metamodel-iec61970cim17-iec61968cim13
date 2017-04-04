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
 * A representation of the model object '<em><b>Excitation System Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics()
 * @model
 * @generated
 */
public interface ExcitationSystemDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Power System Stabilizer Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Stabilizer Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Stabilizer Dynamics</em>' reference.
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_PowerSystemStabilizerDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.PowerSystemStabilizerDynamics' kind='element'"
     * @generated
     */
    PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Stabilizer Dynamics</em>' reference.
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @generated
     */
    void setPowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @generated
     */
    void unsetPowerSystemStabilizerDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Stabilizer Dynamics</em>' reference is set.
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @generated
     */
    boolean isSetPowerSystemStabilizerDynamics();

    /**
     * Returns the value of the '<em><b>Underexcitation Limiter Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcitationLimiterDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Underexcitation Limiter Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underexcitation Limiter Dynamics</em>' reference.
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_UnderexcitationLimiterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcitationLimiterDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.UnderexcitationLimiterDynamics' kind='element'"
     * @generated
     */
    UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underexcitation Limiter Dynamics</em>' reference.
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @generated
     */
    void setUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @generated
     */
    void unsetUnderexcitationLimiterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underexcitation Limiter Dynamics</em>' reference is set.
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @generated
     */
    boolean isSetUnderexcitationLimiterDynamics();

    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type1 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_PFVArControllerType1Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.PFVArControllerType1Dynamics' kind='element'"
     * @generated
     */
    PFVArControllerType1Dynamics getPFVArControllerType1Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @generated
     */
    void setPFVArControllerType1Dynamics( PFVArControllerType1Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    void unsetPFVArControllerType1Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType1Dynamics();

    /**
     * Returns the value of the '<em><b>Discontinuous Excitation Control Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Discontinuous Excitation Control Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference.
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_DiscontinuousExcitationControlDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.DiscontinuousExcitationControlDynamics' kind='element'"
     * @generated
     */
    DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference.
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @generated
     */
    void setDiscontinuousExcitationControlDynamics( DiscontinuousExcitationControlDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @generated
     */
    void unsetDiscontinuousExcitationControlDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference is set.
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @generated
     */
    boolean isSetDiscontinuousExcitationControlDynamics();

    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type2 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType2Dynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_PFVArControllerType2Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType2Dynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.PFVArControllerType2Dynamics' kind='element'"
     * @generated
     */
    PFVArControllerType2Dynamics getPFVArControllerType2Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @generated
     */
    void setPFVArControllerType2Dynamics( PFVArControllerType2Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @generated
     */
    void unsetPFVArControllerType2Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType2Dynamics();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous Machine Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.SynchronousMachineDynamics' kind='element'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @generated
     */
    void setSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetSynchronousMachineDynamics();

    /**
     * Returns the value of the '<em><b>Voltage Compensator Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Compensator Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Compensator Dynamics</em>' reference.
     * @see #isSetVoltageCompensatorDynamics()
     * @see #unsetVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_VoltageCompensatorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.VoltageCompensatorDynamics' kind='element'"
     * @generated
     */
    VoltageCompensatorDynamics getVoltageCompensatorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Compensator Dynamics</em>' reference.
     * @see #isSetVoltageCompensatorDynamics()
     * @see #unsetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @generated
     */
    void setVoltageCompensatorDynamics( VoltageCompensatorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    void unsetVoltageCompensatorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Compensator Dynamics</em>' reference is set.
     * @see #unsetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    boolean isSetVoltageCompensatorDynamics();

    /**
     * Returns the value of the '<em><b>Overexcitation Limiter Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Overexcitation Limiter Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Overexcitation Limiter Dynamics</em>' reference.
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcitationSystemDynamics_OverexcitationLimiterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcitationSystemDynamics.OverexcitationLimiterDynamics' kind='element'"
     * @generated
     */
    OverexcitationLimiterDynamics getOverexcitationLimiterDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Overexcitation Limiter Dynamics</em>' reference.
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @generated
     */
    void setOverexcitationLimiterDynamics( OverexcitationLimiterDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @generated
     */
    void unsetOverexcitationLimiterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Overexcitation Limiter Dynamics</em>' reference is set.
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @generated
     */
    boolean isSetOverexcitationLimiterDynamics();

} // ExcitationSystemDynamics
