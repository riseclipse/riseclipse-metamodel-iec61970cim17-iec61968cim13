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
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getLeftDigitCount <em>Left Digit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getRightDigitCount <em>Right Digit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTierName <em>Tou Tier Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTier <em>Tou Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getEndDeviceFunction <em>End Device Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister()
 * @model
 * @generated
 */
public interface Register extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Virtual</em>' attribute.
     * @see #isSetIsVirtual()
     * @see #unsetIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_IsVirtual()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.isVirtual' kind='element'"
     * @generated
     */
    Boolean getIsVirtual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Virtual</em>' attribute.
     * @see #isSetIsVirtual()
     * @see #unsetIsVirtual()
     * @see #getIsVirtual()
     * @generated
     */
    void setIsVirtual( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsVirtual()
     * @see #getIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @generated
     */
    void unsetIsVirtual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getIsVirtual <em>Is Virtual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Virtual</em>' attribute is set.
     * @see #unsetIsVirtual()
     * @see #getIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @generated
     */
    boolean isSetIsVirtual();

    /**
     * Returns the value of the '<em><b>Left Digit Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left Digit Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left Digit Count</em>' attribute.
     * @see #isSetLeftDigitCount()
     * @see #unsetLeftDigitCount()
     * @see #setLeftDigitCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_LeftDigitCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.leftDigitCount' kind='element'"
     * @generated
     */
    Integer getLeftDigitCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Digit Count</em>' attribute.
     * @see #isSetLeftDigitCount()
     * @see #unsetLeftDigitCount()
     * @see #getLeftDigitCount()
     * @generated
     */
    void setLeftDigitCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLeftDigitCount()
     * @see #getLeftDigitCount()
     * @see #setLeftDigitCount(Integer)
     * @generated
     */
    void unsetLeftDigitCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Left Digit Count</em>' attribute is set.
     * @see #unsetLeftDigitCount()
     * @see #getLeftDigitCount()
     * @see #setLeftDigitCount(Integer)
     * @generated
     */
    boolean isSetLeftDigitCount();

    /**
     * Returns the value of the '<em><b>Right Digit Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right Digit Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right Digit Count</em>' attribute.
     * @see #isSetRightDigitCount()
     * @see #unsetRightDigitCount()
     * @see #setRightDigitCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_RightDigitCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.rightDigitCount' kind='element'"
     * @generated
     */
    Integer getRightDigitCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right Digit Count</em>' attribute.
     * @see #isSetRightDigitCount()
     * @see #unsetRightDigitCount()
     * @see #getRightDigitCount()
     * @generated
     */
    void setRightDigitCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRightDigitCount()
     * @see #getRightDigitCount()
     * @see #setRightDigitCount(Integer)
     * @generated
     */
    void unsetRightDigitCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Right Digit Count</em>' attribute is set.
     * @see #unsetRightDigitCount()
     * @see #getRightDigitCount()
     * @see #setRightDigitCount(Integer)
     * @generated
     */
    boolean isSetRightDigitCount();

    /**
     * Returns the value of the '<em><b>Tou Tier Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tou Tier Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tou Tier Name</em>' attribute.
     * @see #isSetTouTierName()
     * @see #unsetTouTierName()
     * @see #setTouTierName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_TouTierName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.touTierName' kind='element'"
     * @generated
     */
    String getTouTierName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTierName <em>Tou Tier Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tou Tier Name</em>' attribute.
     * @see #isSetTouTierName()
     * @see #unsetTouTierName()
     * @see #getTouTierName()
     * @generated
     */
    void setTouTierName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTierName <em>Tou Tier Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTouTierName()
     * @see #getTouTierName()
     * @see #setTouTierName(String)
     * @generated
     */
    void unsetTouTierName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTierName <em>Tou Tier Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tou Tier Name</em>' attribute is set.
     * @see #unsetTouTierName()
     * @see #getTouTierName()
     * @see #setTouTierName(String)
     * @generated
     */
    boolean isSetTouTierName();

    /**
     * Returns the value of the '<em><b>Tou Tier</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tou Tier</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tou Tier</em>' containment reference.
     * @see #isSetTouTier()
     * @see #unsetTouTier()
     * @see #setTouTier(TimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_TouTier()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.touTier' kind='element'"
     * @generated
     */
    TimeInterval getTouTier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTier <em>Tou Tier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tou Tier</em>' containment reference.
     * @see #isSetTouTier()
     * @see #unsetTouTier()
     * @see #getTouTier()
     * @generated
     */
    void setTouTier( TimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTier <em>Tou Tier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTouTier()
     * @see #getTouTier()
     * @see #setTouTier(TimeInterval)
     * @generated
     */
    void unsetTouTier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getTouTier <em>Tou Tier</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tou Tier</em>' containment reference is set.
     * @see #unsetTouTier()
     * @see #getTouTier()
     * @see #setTouTier(TimeInterval)
     * @generated
     */
    boolean isSetTouTier();

    /**
     * Returns the value of the '<em><b>End Device Function</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction#getRegisters <em>Registers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Function</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Function</em>' reference.
     * @see #isSetEndDeviceFunction()
     * @see #unsetEndDeviceFunction()
     * @see #setEndDeviceFunction(EndDeviceFunction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_EndDeviceFunction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction#getRegisters
     * @model opposite="Registers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.EndDeviceFunction' kind='element'"
     * @generated
     */
    EndDeviceFunction getEndDeviceFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getEndDeviceFunction <em>End Device Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Function</em>' reference.
     * @see #isSetEndDeviceFunction()
     * @see #unsetEndDeviceFunction()
     * @see #getEndDeviceFunction()
     * @generated
     */
    void setEndDeviceFunction( EndDeviceFunction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getEndDeviceFunction <em>End Device Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceFunction()
     * @see #getEndDeviceFunction()
     * @see #setEndDeviceFunction(EndDeviceFunction)
     * @generated
     */
    void unsetEndDeviceFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getEndDeviceFunction <em>End Device Function</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Function</em>' reference is set.
     * @see #unsetEndDeviceFunction()
     * @see #getEndDeviceFunction()
     * @see #setEndDeviceFunction(EndDeviceFunction)
     * @generated
     */
    boolean isSetEndDeviceFunction();

    /**
     * Returns the value of the '<em><b>Channels</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister <em>Register</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channels</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channels</em>' reference list.
     * @see #isSetChannels()
     * @see #unsetChannels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegister_Channels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister
     * @model opposite="Register" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Register.Channels' kind='element'"
     * @generated
     */
    EList< Channel > getChannels();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getChannels <em>Channels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChannels()
     * @see #getChannels()
     * @generated
     */
    void unsetChannels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getChannels <em>Channels</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Channels</em>' reference list is set.
     * @see #unsetChannels()
     * @see #getChannels()
     * @generated
     */
    boolean isSetChannels();

} // Register
