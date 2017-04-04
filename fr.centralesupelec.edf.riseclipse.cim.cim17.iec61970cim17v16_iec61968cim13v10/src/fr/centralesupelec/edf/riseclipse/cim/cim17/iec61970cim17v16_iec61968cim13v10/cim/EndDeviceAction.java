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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getCommand <em>Command</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDurationIndefinite <em>Duration Indefinite</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl <em>End Device Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction()
 * @model
 * @generated
 */
public interface EndDeviceAction extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command</em>' attribute.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #setCommand(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction_Command()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceAction.command' kind='element'"
     * @generated
     */
    String getCommand();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getCommand <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command</em>' attribute.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #getCommand()
     * @generated
     */
    void setCommand( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getCommand <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommand()
     * @see #getCommand()
     * @see #setCommand(String)
     * @generated
     */
    void unsetCommand();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getCommand <em>Command</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Command</em>' attribute is set.
     * @see #unsetCommand()
     * @see #getCommand()
     * @see #setCommand(String)
     * @generated
     */
    boolean isSetCommand();

    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #isSetDuration()
     * @see #unsetDuration()
     * @see #setDuration(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction_Duration()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceAction.duration' kind='element'"
     * @generated
     */
    Float getDuration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #isSetDuration()
     * @see #unsetDuration()
     * @see #getDuration()
     * @generated
     */
    void setDuration( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDuration()
     * @see #getDuration()
     * @see #setDuration(Float)
     * @generated
     */
    void unsetDuration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDuration <em>Duration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duration</em>' attribute is set.
     * @see #unsetDuration()
     * @see #getDuration()
     * @see #setDuration(Float)
     * @generated
     */
    boolean isSetDuration();

    /**
     * Returns the value of the '<em><b>Duration Indefinite</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration Indefinite</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration Indefinite</em>' attribute.
     * @see #isSetDurationIndefinite()
     * @see #unsetDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction_DurationIndefinite()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceAction.durationIndefinite' kind='element'"
     * @generated
     */
    Boolean getDurationIndefinite();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDurationIndefinite <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration Indefinite</em>' attribute.
     * @see #isSetDurationIndefinite()
     * @see #unsetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @generated
     */
    void setDurationIndefinite( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDurationIndefinite <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @generated
     */
    void unsetDurationIndefinite();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getDurationIndefinite <em>Duration Indefinite</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duration Indefinite</em>' attribute is set.
     * @see #unsetDurationIndefinite()
     * @see #getDurationIndefinite()
     * @see #setDurationIndefinite(Boolean)
     * @generated
     */
    boolean isSetDurationIndefinite();

    /**
     * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date Time</em>' attribute.
     * @see #isSetStartDateTime()
     * @see #unsetStartDateTime()
     * @see #setStartDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction_StartDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceAction.startDateTime' kind='element'"
     * @generated
     */
    Date getStartDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getStartDateTime <em>Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date Time</em>' attribute.
     * @see #isSetStartDateTime()
     * @see #unsetStartDateTime()
     * @see #getStartDateTime()
     * @generated
     */
    void setStartDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getStartDateTime <em>Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartDateTime()
     * @see #getStartDateTime()
     * @see #setStartDateTime(Date)
     * @generated
     */
    void unsetStartDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getStartDateTime <em>Start Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Date Time</em>' attribute is set.
     * @see #unsetStartDateTime()
     * @see #getStartDateTime()
     * @see #setStartDateTime(Date)
     * @generated
     */
    boolean isSetStartDateTime();

    /**
     * Returns the value of the '<em><b>End Device Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction <em>End Device Action</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Control</em>' reference.
     * @see #isSetEndDeviceControl()
     * @see #unsetEndDeviceControl()
     * @see #setEndDeviceControl(EndDeviceControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceAction_EndDeviceControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction
     * @model opposite="EndDeviceAction" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceAction.EndDeviceControl' kind='element'"
     * @generated
     */
    EndDeviceControl getEndDeviceControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl <em>End Device Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Control</em>' reference.
     * @see #isSetEndDeviceControl()
     * @see #unsetEndDeviceControl()
     * @see #getEndDeviceControl()
     * @generated
     */
    void setEndDeviceControl( EndDeviceControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl <em>End Device Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceControl()
     * @see #getEndDeviceControl()
     * @see #setEndDeviceControl(EndDeviceControl)
     * @generated
     */
    void unsetEndDeviceControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl <em>End Device Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Control</em>' reference is set.
     * @see #unsetEndDeviceControl()
     * @see #getEndDeviceControl()
     * @see #setEndDeviceControl(EndDeviceControl)
     * @generated
     */
    boolean isSetEndDeviceControl();

} // EndDeviceAction
