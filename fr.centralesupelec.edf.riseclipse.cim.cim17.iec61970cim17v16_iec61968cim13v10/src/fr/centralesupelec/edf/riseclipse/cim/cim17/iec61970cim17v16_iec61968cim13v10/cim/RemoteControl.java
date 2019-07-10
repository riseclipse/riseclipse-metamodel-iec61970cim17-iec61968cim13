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
 * A representation of the model object '<em><b>Remote Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getRemoteControlled <em>Remote Controlled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteControl()
 * @model
 * @generated
 */
public interface RemoteControl extends RemotePoint {
    /**
     * Returns the value of the '<em><b>Actuator Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actuator Maximum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actuator Maximum</em>' attribute.
     * @see #isSetActuatorMaximum()
     * @see #unsetActuatorMaximum()
     * @see #setActuatorMaximum(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteControl_ActuatorMaximum()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteControl.actuatorMaximum' kind='element'"
     * @generated
     */
    Float getActuatorMaximum();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actuator Maximum</em>' attribute.
     * @see #isSetActuatorMaximum()
     * @see #unsetActuatorMaximum()
     * @see #getActuatorMaximum()
     * @generated
     */
    void setActuatorMaximum( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuatorMaximum()
     * @see #getActuatorMaximum()
     * @see #setActuatorMaximum(Float)
     * @generated
     */
    void unsetActuatorMaximum();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actuator Maximum</em>' attribute is set.
     * @see #unsetActuatorMaximum()
     * @see #getActuatorMaximum()
     * @see #setActuatorMaximum(Float)
     * @generated
     */
    boolean isSetActuatorMaximum();

    /**
     * Returns the value of the '<em><b>Actuator Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actuator Minimum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actuator Minimum</em>' attribute.
     * @see #isSetActuatorMinimum()
     * @see #unsetActuatorMinimum()
     * @see #setActuatorMinimum(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteControl_ActuatorMinimum()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteControl.actuatorMinimum' kind='element'"
     * @generated
     */
    Float getActuatorMinimum();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actuator Minimum</em>' attribute.
     * @see #isSetActuatorMinimum()
     * @see #unsetActuatorMinimum()
     * @see #getActuatorMinimum()
     * @generated
     */
    void setActuatorMinimum( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuatorMinimum()
     * @see #getActuatorMinimum()
     * @see #setActuatorMinimum(Float)
     * @generated
     */
    void unsetActuatorMinimum();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actuator Minimum</em>' attribute is set.
     * @see #unsetActuatorMinimum()
     * @see #getActuatorMinimum()
     * @see #setActuatorMinimum(Float)
     * @generated
     */
    boolean isSetActuatorMinimum();

    /**
     * Returns the value of the '<em><b>Remote Controlled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Controlled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Controlled</em>' attribute.
     * @see #isSetRemoteControlled()
     * @see #unsetRemoteControlled()
     * @see #setRemoteControlled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteControl_RemoteControlled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteControl.remoteControlled' kind='element'"
     * @generated
     */
    Boolean getRemoteControlled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getRemoteControlled <em>Remote Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Controlled</em>' attribute.
     * @see #isSetRemoteControlled()
     * @see #unsetRemoteControlled()
     * @see #getRemoteControlled()
     * @generated
     */
    void setRemoteControlled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getRemoteControlled <em>Remote Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteControlled()
     * @see #getRemoteControlled()
     * @see #setRemoteControlled(Boolean)
     * @generated
     */
    void unsetRemoteControlled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getRemoteControlled <em>Remote Controlled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Controlled</em>' attribute is set.
     * @see #unsetRemoteControlled()
     * @see #getRemoteControlled()
     * @see #setRemoteControlled(Boolean)
     * @generated
     */
    boolean isSetRemoteControlled();

    /**
     * Returns the value of the '<em><b>Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl <em>Remote Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control</em>' reference.
     * @see #isSetControl()
     * @see #unsetControl()
     * @see #setControl(Control)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteControl_Control()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl
     * @model opposite="RemoteControl" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteControl.Control' kind='element'"
     * @generated
     */
    Control getControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl <em>Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control</em>' reference.
     * @see #isSetControl()
     * @see #unsetControl()
     * @see #getControl()
     * @generated
     */
    void setControl( Control value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl <em>Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControl()
     * @see #getControl()
     * @see #setControl(Control)
     * @generated
     */
    void unsetControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl <em>Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control</em>' reference is set.
     * @see #unsetControl()
     * @see #getControl()
     * @see #setControl(Control)
     * @generated
     */
    boolean isSetControl();

} // RemoteControl
