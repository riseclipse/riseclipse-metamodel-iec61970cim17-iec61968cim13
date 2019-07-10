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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDiverseReference <em>Diverse Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDonorReference <em>Donor Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceiverReference <em>Receiver Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReversedId <em>Reversed Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsError <em>Service Units Error</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getMeter <em>Meter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift <em>Cashier Shift</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Diverse Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diverse Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diverse Reference</em>' attribute.
     * @see #isSetDiverseReference()
     * @see #unsetDiverseReference()
     * @see #setDiverseReference(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_DiverseReference()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.diverseReference' kind='element'"
     * @generated
     */
    String getDiverseReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diverse Reference</em>' attribute.
     * @see #isSetDiverseReference()
     * @see #unsetDiverseReference()
     * @see #getDiverseReference()
     * @generated
     */
    void setDiverseReference( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiverseReference()
     * @see #getDiverseReference()
     * @see #setDiverseReference(String)
     * @generated
     */
    void unsetDiverseReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diverse Reference</em>' attribute is set.
     * @see #unsetDiverseReference()
     * @see #getDiverseReference()
     * @see #setDiverseReference(String)
     * @generated
     */
    boolean isSetDiverseReference();

    /**
     * Returns the value of the '<em><b>Donor Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Donor Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Donor Reference</em>' attribute.
     * @see #isSetDonorReference()
     * @see #unsetDonorReference()
     * @see #setDonorReference(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_DonorReference()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.donorReference' kind='element'"
     * @generated
     */
    String getDonorReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDonorReference <em>Donor Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Donor Reference</em>' attribute.
     * @see #isSetDonorReference()
     * @see #unsetDonorReference()
     * @see #getDonorReference()
     * @generated
     */
    void setDonorReference( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDonorReference <em>Donor Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDonorReference()
     * @see #getDonorReference()
     * @see #setDonorReference(String)
     * @generated
     */
    void unsetDonorReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getDonorReference <em>Donor Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Donor Reference</em>' attribute is set.
     * @see #unsetDonorReference()
     * @see #getDonorReference()
     * @see #setDonorReference(String)
     * @generated
     */
    boolean isSetDonorReference();

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransactionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransactionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(TransactionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.kind' kind='element'"
     * @generated
     */
    TransactionKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransactionKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( TransactionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(TransactionKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(TransactionKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Receiver Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receiver Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receiver Reference</em>' attribute.
     * @see #isSetReceiverReference()
     * @see #unsetReceiverReference()
     * @see #setReceiverReference(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_ReceiverReference()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.receiverReference' kind='element'"
     * @generated
     */
    String getReceiverReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receiver Reference</em>' attribute.
     * @see #isSetReceiverReference()
     * @see #unsetReceiverReference()
     * @see #getReceiverReference()
     * @generated
     */
    void setReceiverReference( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiverReference()
     * @see #getReceiverReference()
     * @see #setReceiverReference(String)
     * @generated
     */
    void unsetReceiverReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receiver Reference</em>' attribute is set.
     * @see #unsetReceiverReference()
     * @see #getReceiverReference()
     * @see #setReceiverReference(String)
     * @generated
     */
    boolean isSetReceiverReference();

    /**
     * Returns the value of the '<em><b>Reversed Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reversed Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reversed Id</em>' attribute.
     * @see #isSetReversedId()
     * @see #unsetReversedId()
     * @see #setReversedId(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_ReversedId()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.reversedId' kind='element'"
     * @generated
     */
    String getReversedId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReversedId <em>Reversed Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reversed Id</em>' attribute.
     * @see #isSetReversedId()
     * @see #unsetReversedId()
     * @see #getReversedId()
     * @generated
     */
    void setReversedId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReversedId <em>Reversed Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReversedId()
     * @see #getReversedId()
     * @see #setReversedId(String)
     * @generated
     */
    void unsetReversedId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReversedId <em>Reversed Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reversed Id</em>' attribute is set.
     * @see #unsetReversedId()
     * @see #getReversedId()
     * @see #setReversedId(String)
     * @generated
     */
    boolean isSetReversedId();

    /**
     * Returns the value of the '<em><b>Service Units Energy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Units Energy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Units Energy</em>' attribute.
     * @see #isSetServiceUnitsEnergy()
     * @see #unsetServiceUnitsEnergy()
     * @see #setServiceUnitsEnergy(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_ServiceUnitsEnergy()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.serviceUnitsEnergy' kind='element'"
     * @generated
     */
    Float getServiceUnitsEnergy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Units Energy</em>' attribute.
     * @see #isSetServiceUnitsEnergy()
     * @see #unsetServiceUnitsEnergy()
     * @see #getServiceUnitsEnergy()
     * @generated
     */
    void setServiceUnitsEnergy( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceUnitsEnergy()
     * @see #getServiceUnitsEnergy()
     * @see #setServiceUnitsEnergy(Float)
     * @generated
     */
    void unsetServiceUnitsEnergy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Units Energy</em>' attribute is set.
     * @see #unsetServiceUnitsEnergy()
     * @see #getServiceUnitsEnergy()
     * @see #setServiceUnitsEnergy(Float)
     * @generated
     */
    boolean isSetServiceUnitsEnergy();

    /**
     * Returns the value of the '<em><b>Service Units Error</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Units Error</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Units Error</em>' attribute.
     * @see #isSetServiceUnitsError()
     * @see #unsetServiceUnitsError()
     * @see #setServiceUnitsError(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_ServiceUnitsError()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.serviceUnitsError' kind='element'"
     * @generated
     */
    Float getServiceUnitsError();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Units Error</em>' attribute.
     * @see #isSetServiceUnitsError()
     * @see #unsetServiceUnitsError()
     * @see #getServiceUnitsError()
     * @generated
     */
    void setServiceUnitsError( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceUnitsError()
     * @see #getServiceUnitsError()
     * @see #setServiceUnitsError(Float)
     * @generated
     */
    void unsetServiceUnitsError();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Units Error</em>' attribute is set.
     * @see #unsetServiceUnitsError()
     * @see #getServiceUnitsError()
     * @see #setServiceUnitsError(Float)
     * @generated
     */
    boolean isSetServiceUnitsError();

    /**
     * Returns the value of the '<em><b>Line</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' containment reference.
     * @see #isSetLine()
     * @see #unsetLine()
     * @see #setLine(LineDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_Line()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.line' kind='element'"
     * @generated
     */
    LineDetail getLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getLine <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' containment reference.
     * @see #isSetLine()
     * @see #unsetLine()
     * @see #getLine()
     * @generated
     */
    void setLine( LineDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getLine <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLine()
     * @see #getLine()
     * @see #setLine(LineDetail)
     * @generated
     */
    void unsetLine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getLine <em>Line</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line</em>' containment reference is set.
     * @see #unsetLine()
     * @see #getLine()
     * @see #setLine(LineDetail)
     * @generated
     */
    boolean isSetLine();

    /**
     * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getTransactions <em>Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vendor Shift</em>' reference.
     * @see #isSetVendorShift()
     * @see #unsetVendorShift()
     * @see #setVendorShift(VendorShift)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_VendorShift()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getTransactions
     * @model opposite="Transactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.VendorShift' kind='element'"
     * @generated
     */
    VendorShift getVendorShift();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vendor Shift</em>' reference.
     * @see #isSetVendorShift()
     * @see #unsetVendorShift()
     * @see #getVendorShift()
     * @generated
     */
    void setVendorShift( VendorShift value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendorShift()
     * @see #getVendorShift()
     * @see #setVendorShift(VendorShift)
     * @generated
     */
    void unsetVendorShift();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift <em>Vendor Shift</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vendor Shift</em>' reference is set.
     * @see #unsetVendorShift()
     * @see #getVendorShift()
     * @see #setVendorShift(VendorShift)
     * @generated
     */
    boolean isSetVendorShift();

    /**
     * Returns the value of the '<em><b>Customer Account</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_CustomerAccount()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getPaymentTransactions
     * @model opposite="PaymentTransactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.CustomerAccount' kind='element'"
     * @generated
     */
    CustomerAccount getCustomerAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @generated
     */
    void setCustomerAccount( CustomerAccount value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    void unsetCustomerAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount <em>Customer Account</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Account</em>' reference is set.
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    boolean isSetCustomerAccount();

    /**
     * Returns the value of the '<em><b>Receipt</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTransactions <em>Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipt</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipt</em>' reference.
     * @see #isSetReceipt()
     * @see #unsetReceipt()
     * @see #setReceipt(Receipt)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_Receipt()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTransactions
     * @model opposite="Transactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.Receipt' kind='element'"
     * @generated
     */
    Receipt getReceipt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt <em>Receipt</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receipt</em>' reference.
     * @see #isSetReceipt()
     * @see #unsetReceipt()
     * @see #getReceipt()
     * @generated
     */
    void setReceipt( Receipt value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt <em>Receipt</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceipt()
     * @see #getReceipt()
     * @see #setReceipt(Receipt)
     * @generated
     */
    void unsetReceipt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt <em>Receipt</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipt</em>' reference is set.
     * @see #unsetReceipt()
     * @see #getReceipt()
     * @see #setReceipt(Receipt)
     * @generated
     */
    boolean isSetReceipt();

    /**
     * Returns the value of the '<em><b>Auxiliary Account</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Account</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Account</em>' reference.
     * @see #isSetAuxiliaryAccount()
     * @see #unsetAuxiliaryAccount()
     * @see #setAuxiliaryAccount(AuxiliaryAccount)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_AuxiliaryAccount()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPaymentTransactions
     * @model opposite="PaymentTransactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.AuxiliaryAccount' kind='element'"
     * @generated
     */
    AuxiliaryAccount getAuxiliaryAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auxiliary Account</em>' reference.
     * @see #isSetAuxiliaryAccount()
     * @see #unsetAuxiliaryAccount()
     * @see #getAuxiliaryAccount()
     * @generated
     */
    void setAuxiliaryAccount( AuxiliaryAccount value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryAccount()
     * @see #getAuxiliaryAccount()
     * @see #setAuxiliaryAccount(AuxiliaryAccount)
     * @generated
     */
    void unsetAuxiliaryAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Account</em>' reference is set.
     * @see #unsetAuxiliaryAccount()
     * @see #getAuxiliaryAccount()
     * @see #setAuxiliaryAccount(AuxiliaryAccount)
     * @generated
     */
    boolean isSetAuxiliaryAccount();

    /**
     * Returns the value of the '<em><b>Pricing Structure</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTransactions <em>Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pricing Structure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pricing Structure</em>' reference.
     * @see #isSetPricingStructure()
     * @see #unsetPricingStructure()
     * @see #setPricingStructure(PricingStructure)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_PricingStructure()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTransactions
     * @model opposite="Transactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.PricingStructure' kind='element'"
     * @generated
     */
    PricingStructure getPricingStructure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure <em>Pricing Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pricing Structure</em>' reference.
     * @see #isSetPricingStructure()
     * @see #unsetPricingStructure()
     * @see #getPricingStructure()
     * @generated
     */
    void setPricingStructure( PricingStructure value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure <em>Pricing Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPricingStructure()
     * @see #getPricingStructure()
     * @see #setPricingStructure(PricingStructure)
     * @generated
     */
    void unsetPricingStructure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure <em>Pricing Structure</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pricing Structure</em>' reference is set.
     * @see #unsetPricingStructure()
     * @see #getPricingStructure()
     * @see #setPricingStructure(PricingStructure)
     * @generated
     */
    boolean isSetPricingStructure();

    /**
     * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute#getTransaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Attributes</em>' reference list.
     * @see #isSetUserAttributes()
     * @see #unsetUserAttributes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_UserAttributes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute#getTransaction
     * @model opposite="Transaction" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.UserAttributes' kind='element'"
     * @generated
     */
    EList< UserAttribute > getUserAttributes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getUserAttributes <em>User Attributes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUserAttributes()
     * @see #getUserAttributes()
     * @generated
     */
    void unsetUserAttributes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getUserAttributes <em>User Attributes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>User Attributes</em>' reference list is set.
     * @see #unsetUserAttributes()
     * @see #getUserAttributes()
     * @generated
     */
    boolean isSetUserAttributes();

    /**
     * Returns the value of the '<em><b>Meter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getVendingTransactions <em>Vending Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #setMeter(Meter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_Meter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getVendingTransactions
     * @model opposite="VendingTransactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.Meter' kind='element'"
     * @generated
     */
    Meter getMeter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #getMeter()
     * @generated
     */
    void setMeter( Meter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    void unsetMeter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getMeter <em>Meter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter</em>' reference is set.
     * @see #unsetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    boolean isSetMeter();

    /**
     * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getTransactions <em>Transactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cashier Shift</em>' reference.
     * @see #isSetCashierShift()
     * @see #unsetCashierShift()
     * @see #setCashierShift(CashierShift)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransaction_CashierShift()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getTransactions
     * @model opposite="Transactions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Transaction.CashierShift' kind='element'"
     * @generated
     */
    CashierShift getCashierShift();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cashier Shift</em>' reference.
     * @see #isSetCashierShift()
     * @see #unsetCashierShift()
     * @see #getCashierShift()
     * @generated
     */
    void setCashierShift( CashierShift value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCashierShift()
     * @see #getCashierShift()
     * @see #setCashierShift(CashierShift)
     * @generated
     */
    void unsetCashierShift();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift <em>Cashier Shift</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cashier Shift</em>' reference is set.
     * @see #unsetCashierShift()
     * @see #getCashierShift()
     * @see #setCashierShift(CashierShift)
     * @generated
     */
    boolean isSetCashierShift();

} // Transaction
