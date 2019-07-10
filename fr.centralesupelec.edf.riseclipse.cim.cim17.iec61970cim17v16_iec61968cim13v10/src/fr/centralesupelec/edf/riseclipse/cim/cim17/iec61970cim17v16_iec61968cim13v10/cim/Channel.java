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
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends IdentifiedObject {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChannel_IsVirtual()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Channel.isVirtual' kind='element'"
     * @generated
     */
    Boolean getIsVirtual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getIsVirtual <em>Is Virtual</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsVirtual()
     * @see #getIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @generated
     */
    void unsetIsVirtual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getIsVirtual <em>Is Virtual</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Reading Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getChannel <em>Channel</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChannel_ReadingType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getChannel
     * @model opposite="Channel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Channel.ReadingType' kind='element'"
     * @generated
     */
    ReadingType getReadingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getReadingType <em>Reading Type</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getReadingType <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadingType()
     * @see #getReadingType()
     * @see #setReadingType(ReadingType)
     * @generated
     */
    void unsetReadingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getReadingType <em>Reading Type</em>}' reference is set.
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
     * Returns the value of the '<em><b>Register</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getChannels <em>Channels</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Register</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Register</em>' reference.
     * @see #isSetRegister()
     * @see #unsetRegister()
     * @see #setRegister(Register)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChannel_Register()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register#getChannels
     * @model opposite="Channels" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Channel.Register' kind='element'"
     * @generated
     */
    Register getRegister();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister <em>Register</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Register</em>' reference.
     * @see #isSetRegister()
     * @see #unsetRegister()
     * @see #getRegister()
     * @generated
     */
    void setRegister( Register value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister <em>Register</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegister()
     * @see #getRegister()
     * @see #setRegister(Register)
     * @generated
     */
    void unsetRegister();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel#getRegister <em>Register</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Register</em>' reference is set.
     * @see #unsetRegister()
     * @see #getRegister()
     * @see #setRegister(Register)
     * @generated
     */
    boolean isSetRegister();

} // Channel
