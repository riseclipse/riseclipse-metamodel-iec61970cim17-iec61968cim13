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
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getAccountHolderName <em>Account Holder Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getCvNumber <em>Cv Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getPan <em>Pan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Account Holder Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account Holder Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account Holder Name</em>' attribute.
     * @see #isSetAccountHolderName()
     * @see #unsetAccountHolderName()
     * @see #setAccountHolderName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard_AccountHolderName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Card.accountHolderName' kind='element'"
     * @generated
     */
    String getAccountHolderName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Account Holder Name</em>' attribute.
     * @see #isSetAccountHolderName()
     * @see #unsetAccountHolderName()
     * @see #getAccountHolderName()
     * @generated
     */
    void setAccountHolderName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccountHolderName()
     * @see #getAccountHolderName()
     * @see #setAccountHolderName(String)
     * @generated
     */
    void unsetAccountHolderName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Account Holder Name</em>' attribute is set.
     * @see #unsetAccountHolderName()
     * @see #getAccountHolderName()
     * @see #setAccountHolderName(String)
     * @generated
     */
    boolean isSetAccountHolderName();

    /**
     * Returns the value of the '<em><b>Cv Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cv Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cv Number</em>' attribute.
     * @see #isSetCvNumber()
     * @see #unsetCvNumber()
     * @see #setCvNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard_CvNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Card.cvNumber' kind='element'"
     * @generated
     */
    String getCvNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getCvNumber <em>Cv Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cv Number</em>' attribute.
     * @see #isSetCvNumber()
     * @see #unsetCvNumber()
     * @see #getCvNumber()
     * @generated
     */
    void setCvNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getCvNumber <em>Cv Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCvNumber()
     * @see #getCvNumber()
     * @see #setCvNumber(String)
     * @generated
     */
    void unsetCvNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getCvNumber <em>Cv Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cv Number</em>' attribute is set.
     * @see #unsetCvNumber()
     * @see #getCvNumber()
     * @see #setCvNumber(String)
     * @generated
     */
    boolean isSetCvNumber();

    /**
     * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expiry Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expiry Date</em>' attribute.
     * @see #isSetExpiryDate()
     * @see #unsetExpiryDate()
     * @see #setExpiryDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard_ExpiryDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Card.expiryDate' kind='element'"
     * @generated
     */
    Date getExpiryDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expiry Date</em>' attribute.
     * @see #isSetExpiryDate()
     * @see #unsetExpiryDate()
     * @see #getExpiryDate()
     * @generated
     */
    void setExpiryDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExpiryDate()
     * @see #getExpiryDate()
     * @see #setExpiryDate(Date)
     * @generated
     */
    void unsetExpiryDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getExpiryDate <em>Expiry Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Expiry Date</em>' attribute is set.
     * @see #unsetExpiryDate()
     * @see #getExpiryDate()
     * @see #setExpiryDate(Date)
     * @generated
     */
    boolean isSetExpiryDate();

    /**
     * Returns the value of the '<em><b>Pan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pan</em>' attribute.
     * @see #isSetPan()
     * @see #unsetPan()
     * @see #setPan(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard_Pan()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Card.pan' kind='element'"
     * @generated
     */
    String getPan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getPan <em>Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pan</em>' attribute.
     * @see #isSetPan()
     * @see #unsetPan()
     * @see #getPan()
     * @generated
     */
    void setPan( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getPan <em>Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPan()
     * @see #getPan()
     * @see #setPan(String)
     * @generated
     */
    void unsetPan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getPan <em>Pan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pan</em>' attribute is set.
     * @see #unsetPan()
     * @see #getPan()
     * @see #setPan(String)
     * @generated
     */
    boolean isSetPan();

    /**
     * Returns the value of the '<em><b>Tender</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender#getCard <em>Card</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tender</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tender</em>' reference.
     * @see #isSetTender()
     * @see #unsetTender()
     * @see #setTender(Tender)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCard_Tender()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender#getCard
     * @model opposite="Card" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Card.Tender' kind='element'"
     * @generated
     */
    Tender getTender();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getTender <em>Tender</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tender</em>' reference.
     * @see #isSetTender()
     * @see #unsetTender()
     * @see #getTender()
     * @generated
     */
    void setTender( Tender value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getTender <em>Tender</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTender()
     * @see #getTender()
     * @see #setTender(Tender)
     * @generated
     */
    void unsetTender();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Card#getTender <em>Tender</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tender</em>' reference is set.
     * @see #unsetTender()
     * @see #getTender()
     * @see #setTender(Tender)
     * @generated
     */
    boolean isSetTender();

} // Card
