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
 * A representation of the model object '<em><b>Voltage Compensator Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageCompensatorDynamics()
 * @model
 * @generated
 */
public interface VoltageCompensatorDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Excitation System Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Excitation System Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Excitation System Dynamics</em>' reference.
     * @see #isSetExcitationSystemDynamics()
     * @see #unsetExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageCompensatorDynamics_ExcitationSystemDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics
     * @model opposite="VoltageCompensatorDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VoltageCompensatorDynamics.ExcitationSystemDynamics' kind='element'"
     * @generated
     */
    ExcitationSystemDynamics getExcitationSystemDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Excitation System Dynamics</em>' reference.
     * @see #isSetExcitationSystemDynamics()
     * @see #unsetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @generated
     */
    void setExcitationSystemDynamics( ExcitationSystemDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @generated
     */
    void unsetExcitationSystemDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Excitation System Dynamics</em>' reference is set.
     * @see #unsetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @generated
     */
    boolean isSetExcitationSystemDynamics();

    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Input Signal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageCompensatorDynamics_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal#getVoltageCompensatorDynamics
     * @model opposite="VoltageCompensatorDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VoltageCompensatorDynamics.RemoteInputSignal' kind='element'"
     * @generated
     */
    RemoteInputSignal getRemoteInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @generated
     */
    void setRemoteInputSignal( RemoteInputSignal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Input Signal</em>' reference is set.
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    boolean isSetRemoteInputSignal();

} // VoltageCompensatorDynamics
