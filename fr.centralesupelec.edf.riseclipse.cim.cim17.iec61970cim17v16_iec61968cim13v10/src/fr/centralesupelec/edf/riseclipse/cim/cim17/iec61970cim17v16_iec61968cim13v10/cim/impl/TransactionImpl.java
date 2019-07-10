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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LineDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransactionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getDiverseReference <em>Diverse Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getDonorReference <em>Donor Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getReceiverReference <em>Receiver Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getReversedId <em>Reversed Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getServiceUnitsEnergy <em>Service Units Energy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getServiceUnitsError <em>Service Units Error</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getAuxiliaryAccount <em>Auxiliary Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransactionImpl#getCashierShift <em>Cashier Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends IdentifiedObjectImpl implements Transaction {
    /**
     * The default value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiverseReference()
     * @generated
     * @ordered
     */
    protected static final String DIVERSE_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiverseReference()
     * @generated
     * @ordered
     */
    protected String diverseReference = DIVERSE_REFERENCE_EDEFAULT;

    /**
     * This is true if the Diverse Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diverseReferenceESet;

    /**
     * The default value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDonorReference()
     * @generated
     * @ordered
     */
    protected static final String DONOR_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDonorReference()
     * @generated
     * @ordered
     */
    protected String donorReference = DONOR_REFERENCE_EDEFAULT;

    /**
     * This is true if the Donor Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean donorReferenceESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final TransactionKind KIND_EDEFAULT = TransactionKind.SERVICE_CHARGE_PAYMENT;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected TransactionKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiverReference()
     * @generated
     * @ordered
     */
    protected static final String RECEIVER_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiverReference()
     * @generated
     * @ordered
     */
    protected String receiverReference = RECEIVER_REFERENCE_EDEFAULT;

    /**
     * This is true if the Receiver Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiverReferenceESet;

    /**
     * The default value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversedId()
     * @generated
     * @ordered
     */
    protected static final String REVERSED_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversedId()
     * @generated
     * @ordered
     */
    protected String reversedId = REVERSED_ID_EDEFAULT;

    /**
     * This is true if the Reversed Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reversedIdESet;

    /**
     * The default value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceUnitsEnergy()
     * @generated
     * @ordered
     */
    protected static final Float SERVICE_UNITS_ENERGY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceUnitsEnergy()
     * @generated
     * @ordered
     */
    protected Float serviceUnitsEnergy = SERVICE_UNITS_ENERGY_EDEFAULT;

    /**
     * This is true if the Service Units Energy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceUnitsEnergyESet;

    /**
     * The default value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceUnitsError()
     * @generated
     * @ordered
     */
    protected static final Float SERVICE_UNITS_ERROR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceUnitsError()
     * @generated
     * @ordered
     */
    protected Float serviceUnitsError = SERVICE_UNITS_ERROR_EDEFAULT;

    /**
     * This is true if the Service Units Error attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceUnitsErrorESet;

    /**
     * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
    protected LineDetail line;

    /**
     * This is true if the Line containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineESet;

    /**
     * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendorShift()
     * @generated
     * @ordered
     */
    protected VendorShift vendorShift;

    /**
     * This is true if the Vendor Shift reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vendorShiftESet;

    /**
     * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAccount()
     * @generated
     * @ordered
     */
    protected CustomerAccount customerAccount;

    /**
     * This is true if the Customer Account reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAccountESet;

    /**
     * The cached value of the '{@link #getReceipt() <em>Receipt</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceipt()
     * @generated
     * @ordered
     */
    protected Receipt receipt;

    /**
     * This is true if the Receipt reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiptESet;

    /**
     * The cached value of the '{@link #getAuxiliaryAccount() <em>Auxiliary Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryAccount()
     * @generated
     * @ordered
     */
    protected AuxiliaryAccount auxiliaryAccount;

    /**
     * This is true if the Auxiliary Account reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxiliaryAccountESet;

    /**
     * The cached value of the '{@link #getPricingStructure() <em>Pricing Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingStructure()
     * @generated
     * @ordered
     */
    protected PricingStructure pricingStructure;

    /**
     * This is true if the Pricing Structure reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pricingStructureESet;

    /**
     * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserAttributes()
     * @generated
     * @ordered
     */
    protected EList< UserAttribute > userAttributes;

    /**
     * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeter()
     * @generated
     * @ordered
     */
    protected Meter meter;

    /**
     * This is true if the Meter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean meterESet;

    /**
     * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashierShift()
     * @generated
     * @ordered
     */
    protected CashierShift cashierShift;

    /**
     * This is true if the Cashier Shift reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cashierShiftESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransactionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransaction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDiverseReference() {
        return diverseReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiverseReference( String newDiverseReference ) {
        String oldDiverseReference = diverseReference;
        diverseReference = newDiverseReference;
        boolean oldDiverseReferenceESet = diverseReferenceESet;
        diverseReferenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__DIVERSE_REFERENCE,
                    oldDiverseReference, diverseReference, !oldDiverseReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiverseReference() {
        String oldDiverseReference = diverseReference;
        boolean oldDiverseReferenceESet = diverseReferenceESet;
        diverseReference = DIVERSE_REFERENCE_EDEFAULT;
        diverseReferenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSACTION__DIVERSE_REFERENCE,
                    oldDiverseReference, DIVERSE_REFERENCE_EDEFAULT, oldDiverseReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiverseReference() {
        return diverseReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDonorReference() {
        return donorReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDonorReference( String newDonorReference ) {
        String oldDonorReference = donorReference;
        donorReference = newDonorReference;
        boolean oldDonorReferenceESet = donorReferenceESet;
        donorReferenceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSACTION__DONOR_REFERENCE, oldDonorReference, donorReference, !oldDonorReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDonorReference() {
        String oldDonorReference = donorReference;
        boolean oldDonorReferenceESet = donorReferenceESet;
        donorReference = DONOR_REFERENCE_EDEFAULT;
        donorReferenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSACTION__DONOR_REFERENCE,
                    oldDonorReference, DONOR_REFERENCE_EDEFAULT, oldDonorReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDonorReference() {
        return donorReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransactionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( TransactionKind newKind ) {
        TransactionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSACTION__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        TransactionKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSACTION__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReceiverReference() {
        return receiverReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceiverReference( String newReceiverReference ) {
        String oldReceiverReference = receiverReference;
        receiverReference = newReceiverReference;
        boolean oldReceiverReferenceESet = receiverReferenceESet;
        receiverReferenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__RECEIVER_REFERENCE,
                    oldReceiverReference, receiverReference, !oldReceiverReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceiverReference() {
        String oldReceiverReference = receiverReference;
        boolean oldReceiverReferenceESet = receiverReferenceESet;
        receiverReference = RECEIVER_REFERENCE_EDEFAULT;
        receiverReferenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSACTION__RECEIVER_REFERENCE,
                    oldReceiverReference, RECEIVER_REFERENCE_EDEFAULT, oldReceiverReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceiverReference() {
        return receiverReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReversedId() {
        return reversedId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReversedId( String newReversedId ) {
        String oldReversedId = reversedId;
        reversedId = newReversedId;
        boolean oldReversedIdESet = reversedIdESet;
        reversedIdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSACTION__REVERSED_ID, oldReversedId, reversedId, !oldReversedIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReversedId() {
        String oldReversedId = reversedId;
        boolean oldReversedIdESet = reversedIdESet;
        reversedId = REVERSED_ID_EDEFAULT;
        reversedIdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSACTION__REVERSED_ID, oldReversedId, REVERSED_ID_EDEFAULT, oldReversedIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReversedId() {
        return reversedIdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getServiceUnitsEnergy() {
        return serviceUnitsEnergy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceUnitsEnergy( Float newServiceUnitsEnergy ) {
        Float oldServiceUnitsEnergy = serviceUnitsEnergy;
        serviceUnitsEnergy = newServiceUnitsEnergy;
        boolean oldServiceUnitsEnergyESet = serviceUnitsEnergyESet;
        serviceUnitsEnergyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY,
                    oldServiceUnitsEnergy, serviceUnitsEnergy, !oldServiceUnitsEnergyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceUnitsEnergy() {
        Float oldServiceUnitsEnergy = serviceUnitsEnergy;
        boolean oldServiceUnitsEnergyESet = serviceUnitsEnergyESet;
        serviceUnitsEnergy = SERVICE_UNITS_ENERGY_EDEFAULT;
        serviceUnitsEnergyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY,
                    oldServiceUnitsEnergy, SERVICE_UNITS_ENERGY_EDEFAULT, oldServiceUnitsEnergyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceUnitsEnergy() {
        return serviceUnitsEnergyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getServiceUnitsError() {
        return serviceUnitsError;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceUnitsError( Float newServiceUnitsError ) {
        Float oldServiceUnitsError = serviceUnitsError;
        serviceUnitsError = newServiceUnitsError;
        boolean oldServiceUnitsErrorESet = serviceUnitsErrorESet;
        serviceUnitsErrorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__SERVICE_UNITS_ERROR,
                    oldServiceUnitsError, serviceUnitsError, !oldServiceUnitsErrorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceUnitsError() {
        Float oldServiceUnitsError = serviceUnitsError;
        boolean oldServiceUnitsErrorESet = serviceUnitsErrorESet;
        serviceUnitsError = SERVICE_UNITS_ERROR_EDEFAULT;
        serviceUnitsErrorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSACTION__SERVICE_UNITS_ERROR,
                    oldServiceUnitsError, SERVICE_UNITS_ERROR_EDEFAULT, oldServiceUnitsErrorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceUnitsError() {
        return serviceUnitsErrorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LineDetail getLine() {
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLine( LineDetail newLine, NotificationChain msgs ) {
        LineDetail oldLine = line;
        line = newLine;
        boolean oldLineESet = lineESet;
        lineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__LINE, oldLine, newLine, !oldLineESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLine( LineDetail newLine ) {
        if( newLine != line ) {
            NotificationChain msgs = null;
            if( line != null ) msgs = ( ( InternalEObject ) line ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TRANSACTION__LINE, null, msgs );
            if( newLine != null ) msgs = ( ( InternalEObject ) newLine ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TRANSACTION__LINE, null, msgs );
            msgs = basicSetLine( newLine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineESet = lineESet;
            lineESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__LINE, newLine, newLine, !oldLineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLine( NotificationChain msgs ) {
        LineDetail oldLine = line;
        line = null;
        boolean oldLineESet = lineESet;
        lineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__LINE, oldLine, null, oldLineESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLine() {
        if( line != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) line ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TRANSACTION__LINE, null, msgs );
            msgs = basicUnsetLine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineESet = lineESet;
            lineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__LINE, null, null, oldLineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLine() {
        return lineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VendorShift getVendorShift() {
        return vendorShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVendorShift( VendorShift newVendorShift, NotificationChain msgs ) {
        VendorShift oldVendorShift = vendorShift;
        vendorShift = newVendorShift;
        boolean oldVendorShiftESet = vendorShiftESet;
        vendorShiftESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__VENDOR_SHIFT, oldVendorShift, newVendorShift, !oldVendorShiftESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVendorShift( VendorShift newVendorShift ) {
        if( newVendorShift != vendorShift ) {
            NotificationChain msgs = null;
            if( vendorShift != null ) msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this,
                    CimPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs );
            if( newVendorShift != null ) msgs = ( ( InternalEObject ) newVendorShift ).eInverseAdd( this,
                    CimPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs );
            msgs = basicSetVendorShift( newVendorShift, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorShiftESet = vendorShiftESet;
            vendorShiftESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__VENDOR_SHIFT, newVendorShift, newVendorShift, !oldVendorShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVendorShift( NotificationChain msgs ) {
        VendorShift oldVendorShift = vendorShift;
        vendorShift = null;
        boolean oldVendorShiftESet = vendorShiftESet;
        vendorShiftESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__VENDOR_SHIFT, oldVendorShift, null, oldVendorShiftESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendorShift() {
        if( vendorShift != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this, CimPackage.VENDOR_SHIFT__TRANSACTIONS,
                    VendorShift.class, msgs );
            msgs = basicUnsetVendorShift( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorShiftESet = vendorShiftESet;
            vendorShiftESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__VENDOR_SHIFT, null, null, oldVendorShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendorShift() {
        return vendorShiftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAccount( CustomerAccount newCustomerAccount, NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = newCustomerAccount;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount,
                    !oldCustomerAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomerAccount( CustomerAccount newCustomerAccount ) {
        if( newCustomerAccount != customerAccount ) {
            NotificationChain msgs = null;
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs );
            if( newCustomerAccount != null ) msgs = ( ( InternalEObject ) newCustomerAccount ).eInverseAdd( this,
                    CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs );
            msgs = basicSetCustomerAccount( newCustomerAccount, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__CUSTOMER_ACCOUNT,
                        newCustomerAccount, newCustomerAccount, !oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAccount( NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = null;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__CUSTOMER_ACCOUNT, oldCustomerAccount, null, oldCustomerAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAccount() {
        if( customerAccount != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs );
            msgs = basicUnsetCustomerAccount( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__CUSTOMER_ACCOUNT, null, null, oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAccount() {
        return customerAccountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReceipt( Receipt newReceipt, NotificationChain msgs ) {
        Receipt oldReceipt = receipt;
        receipt = newReceipt;
        boolean oldReceiptESet = receiptESet;
        receiptESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__RECEIPT, oldReceipt, newReceipt, !oldReceiptESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceipt( Receipt newReceipt ) {
        if( newReceipt != receipt ) {
            NotificationChain msgs = null;
            if( receipt != null ) msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this,
                    CimPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs );
            if( newReceipt != null ) msgs = ( ( InternalEObject ) newReceipt ).eInverseAdd( this,
                    CimPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs );
            msgs = basicSetReceipt( newReceipt, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReceiptESet = receiptESet;
            receiptESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__RECEIPT, newReceipt, newReceipt, !oldReceiptESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReceipt( NotificationChain msgs ) {
        Receipt oldReceipt = receipt;
        receipt = null;
        boolean oldReceiptESet = receiptESet;
        receiptESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__RECEIPT, oldReceipt, null, oldReceiptESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceipt() {
        if( receipt != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this, CimPackage.RECEIPT__TRANSACTIONS,
                    Receipt.class, msgs );
            msgs = basicUnsetReceipt( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReceiptESet = receiptESet;
            receiptESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__RECEIPT, null, null, oldReceiptESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceipt() {
        return receiptESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryAccount getAuxiliaryAccount() {
        return auxiliaryAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuxiliaryAccount( AuxiliaryAccount newAuxiliaryAccount, NotificationChain msgs ) {
        AuxiliaryAccount oldAuxiliaryAccount = auxiliaryAccount;
        auxiliaryAccount = newAuxiliaryAccount;
        boolean oldAuxiliaryAccountESet = auxiliaryAccountESet;
        auxiliaryAccountESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__AUXILIARY_ACCOUNT, oldAuxiliaryAccount, newAuxiliaryAccount,
                    !oldAuxiliaryAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxiliaryAccount( AuxiliaryAccount newAuxiliaryAccount ) {
        if( newAuxiliaryAccount != auxiliaryAccount ) {
            NotificationChain msgs = null;
            if( auxiliaryAccount != null ) msgs = ( ( InternalEObject ) auxiliaryAccount ).eInverseRemove( this,
                    CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs );
            if( newAuxiliaryAccount != null ) msgs = ( ( InternalEObject ) newAuxiliaryAccount ).eInverseAdd( this,
                    CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs );
            msgs = basicSetAuxiliaryAccount( newAuxiliaryAccount, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuxiliaryAccountESet = auxiliaryAccountESet;
            auxiliaryAccountESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__AUXILIARY_ACCOUNT,
                        newAuxiliaryAccount, newAuxiliaryAccount, !oldAuxiliaryAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAuxiliaryAccount( NotificationChain msgs ) {
        AuxiliaryAccount oldAuxiliaryAccount = auxiliaryAccount;
        auxiliaryAccount = null;
        boolean oldAuxiliaryAccountESet = auxiliaryAccountESet;
        auxiliaryAccountESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__AUXILIARY_ACCOUNT, oldAuxiliaryAccount, null, oldAuxiliaryAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxiliaryAccount() {
        if( auxiliaryAccount != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) auxiliaryAccount ).eInverseRemove( this,
                    CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs );
            msgs = basicUnsetAuxiliaryAccount( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuxiliaryAccountESet = auxiliaryAccountESet;
            auxiliaryAccountESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__AUXILIARY_ACCOUNT, null, null, oldAuxiliaryAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryAccount() {
        return auxiliaryAccountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PricingStructure getPricingStructure() {
        return pricingStructure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPricingStructure( PricingStructure newPricingStructure, NotificationChain msgs ) {
        PricingStructure oldPricingStructure = pricingStructure;
        pricingStructure = newPricingStructure;
        boolean oldPricingStructureESet = pricingStructureESet;
        pricingStructureESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__PRICING_STRUCTURE, oldPricingStructure, newPricingStructure,
                    !oldPricingStructureESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPricingStructure( PricingStructure newPricingStructure ) {
        if( newPricingStructure != pricingStructure ) {
            NotificationChain msgs = null;
            if( pricingStructure != null ) msgs = ( ( InternalEObject ) pricingStructure ).eInverseRemove( this,
                    CimPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs );
            if( newPricingStructure != null ) msgs = ( ( InternalEObject ) newPricingStructure ).eInverseAdd( this,
                    CimPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs );
            msgs = basicSetPricingStructure( newPricingStructure, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPricingStructureESet = pricingStructureESet;
            pricingStructureESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSACTION__PRICING_STRUCTURE,
                        newPricingStructure, newPricingStructure, !oldPricingStructureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPricingStructure( NotificationChain msgs ) {
        PricingStructure oldPricingStructure = pricingStructure;
        pricingStructure = null;
        boolean oldPricingStructureESet = pricingStructureESet;
        pricingStructureESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__PRICING_STRUCTURE, oldPricingStructure, null, oldPricingStructureESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPricingStructure() {
        if( pricingStructure != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pricingStructure ).eInverseRemove( this,
                    CimPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs );
            msgs = basicUnsetPricingStructure( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPricingStructureESet = pricingStructureESet;
            pricingStructureESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__PRICING_STRUCTURE, null, null, oldPricingStructureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPricingStructure() {
        return pricingStructureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UserAttribute > getUserAttributes() {
        if( userAttributes == null ) {
            userAttributes = new EObjectWithInverseResolvingEList.Unsettable< UserAttribute >( UserAttribute.class,
                    this, CimPackage.TRANSACTION__USER_ATTRIBUTES, CimPackage.USER_ATTRIBUTE__TRANSACTION );
        }
        return userAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserAttributes() {
        if( userAttributes != null ) ( ( InternalEList.Unsettable< ? > ) userAttributes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserAttributes() {
        return userAttributes != null && ( ( InternalEList.Unsettable< ? > ) userAttributes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Meter getMeter() {
        return meter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeter( Meter newMeter, NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = newMeter;
        boolean oldMeterESet = meterESet;
        meterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__METER, oldMeter, newMeter, !oldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeter( Meter newMeter ) {
        if( newMeter != meter ) {
            NotificationChain msgs = null;
            if( meter != null ) msgs = ( ( InternalEObject ) meter ).eInverseRemove( this,
                    CimPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs );
            if( newMeter != null ) msgs = ( ( InternalEObject ) newMeter ).eInverseAdd( this,
                    CimPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs );
            msgs = basicSetMeter( newMeter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__METER, newMeter, newMeter, !oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeter( NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = null;
        boolean oldMeterESet = meterESet;
        meterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__METER, oldMeter, null, oldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeter() {
        if( meter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) meter ).eInverseRemove( this, CimPackage.METER__VENDING_TRANSACTIONS,
                    Meter.class, msgs );
            msgs = basicUnsetMeter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__METER, null, null, oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeter() {
        return meterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CashierShift getCashierShift() {
        return cashierShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCashierShift( CashierShift newCashierShift, NotificationChain msgs ) {
        CashierShift oldCashierShift = cashierShift;
        cashierShift = newCashierShift;
        boolean oldCashierShiftESet = cashierShiftESet;
        cashierShiftESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__CASHIER_SHIFT, oldCashierShift, newCashierShift, !oldCashierShiftESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCashierShift( CashierShift newCashierShift ) {
        if( newCashierShift != cashierShift ) {
            NotificationChain msgs = null;
            if( cashierShift != null ) msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this,
                    CimPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs );
            if( newCashierShift != null ) msgs = ( ( InternalEObject ) newCashierShift ).eInverseAdd( this,
                    CimPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs );
            msgs = basicSetCashierShift( newCashierShift, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierShiftESet = cashierShiftESet;
            cashierShiftESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSACTION__CASHIER_SHIFT, newCashierShift, newCashierShift, !oldCashierShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCashierShift( NotificationChain msgs ) {
        CashierShift oldCashierShift = cashierShift;
        cashierShift = null;
        boolean oldCashierShiftESet = cashierShiftESet;
        cashierShiftESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__CASHIER_SHIFT, oldCashierShift, null, oldCashierShiftESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCashierShift() {
        if( cashierShift != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this, CimPackage.CASHIER_SHIFT__TRANSACTIONS,
                    CashierShift.class, msgs );
            msgs = basicUnsetCashierShift( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierShiftESet = cashierShiftESet;
            cashierShiftESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSACTION__CASHIER_SHIFT, null, null, oldCashierShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCashierShift() {
        return cashierShiftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            if( vendorShift != null ) msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this,
                    CimPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs );
            return basicSetVendorShift( ( VendorShift ) otherEnd, msgs );
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs );
            return basicSetCustomerAccount( ( CustomerAccount ) otherEnd, msgs );
        case CimPackage.TRANSACTION__RECEIPT:
            if( receipt != null ) msgs = ( ( InternalEObject ) receipt ).eInverseRemove( this,
                    CimPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs );
            return basicSetReceipt( ( Receipt ) otherEnd, msgs );
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            if( auxiliaryAccount != null ) msgs = ( ( InternalEObject ) auxiliaryAccount ).eInverseRemove( this,
                    CimPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs );
            return basicSetAuxiliaryAccount( ( AuxiliaryAccount ) otherEnd, msgs );
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            if( pricingStructure != null ) msgs = ( ( InternalEObject ) pricingStructure ).eInverseRemove( this,
                    CimPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs );
            return basicSetPricingStructure( ( PricingStructure ) otherEnd, msgs );
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUserAttributes() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSACTION__METER:
            if( meter != null ) msgs = ( ( InternalEObject ) meter ).eInverseRemove( this,
                    CimPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs );
            return basicSetMeter( ( Meter ) otherEnd, msgs );
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            if( cashierShift != null ) msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this,
                    CimPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs );
            return basicSetCashierShift( ( CashierShift ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__LINE:
            return basicUnsetLine( msgs );
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            return basicUnsetVendorShift( msgs );
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            return basicUnsetCustomerAccount( msgs );
        case CimPackage.TRANSACTION__RECEIPT:
            return basicUnsetReceipt( msgs );
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            return basicUnsetAuxiliaryAccount( msgs );
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            return basicUnsetPricingStructure( msgs );
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            return ( ( InternalEList< ? > ) getUserAttributes() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSACTION__METER:
            return basicUnsetMeter( msgs );
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            return basicUnsetCashierShift( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__DIVERSE_REFERENCE:
            return getDiverseReference();
        case CimPackage.TRANSACTION__DONOR_REFERENCE:
            return getDonorReference();
        case CimPackage.TRANSACTION__KIND:
            return getKind();
        case CimPackage.TRANSACTION__RECEIVER_REFERENCE:
            return getReceiverReference();
        case CimPackage.TRANSACTION__REVERSED_ID:
            return getReversedId();
        case CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
            return getServiceUnitsEnergy();
        case CimPackage.TRANSACTION__SERVICE_UNITS_ERROR:
            return getServiceUnitsError();
        case CimPackage.TRANSACTION__LINE:
            return getLine();
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            return getVendorShift();
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            return getCustomerAccount();
        case CimPackage.TRANSACTION__RECEIPT:
            return getReceipt();
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            return getAuxiliaryAccount();
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            return getPricingStructure();
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            return getUserAttributes();
        case CimPackage.TRANSACTION__METER:
            return getMeter();
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            return getCashierShift();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__DIVERSE_REFERENCE:
            setDiverseReference( ( String ) newValue );
            return;
        case CimPackage.TRANSACTION__DONOR_REFERENCE:
            setDonorReference( ( String ) newValue );
            return;
        case CimPackage.TRANSACTION__KIND:
            setKind( ( TransactionKind ) newValue );
            return;
        case CimPackage.TRANSACTION__RECEIVER_REFERENCE:
            setReceiverReference( ( String ) newValue );
            return;
        case CimPackage.TRANSACTION__REVERSED_ID:
            setReversedId( ( String ) newValue );
            return;
        case CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
            setServiceUnitsEnergy( ( Float ) newValue );
            return;
        case CimPackage.TRANSACTION__SERVICE_UNITS_ERROR:
            setServiceUnitsError( ( Float ) newValue );
            return;
        case CimPackage.TRANSACTION__LINE:
            setLine( ( LineDetail ) newValue );
            return;
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            setVendorShift( ( VendorShift ) newValue );
            return;
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            setCustomerAccount( ( CustomerAccount ) newValue );
            return;
        case CimPackage.TRANSACTION__RECEIPT:
            setReceipt( ( Receipt ) newValue );
            return;
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            setAuxiliaryAccount( ( AuxiliaryAccount ) newValue );
            return;
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            setPricingStructure( ( PricingStructure ) newValue );
            return;
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            getUserAttributes().clear();
            getUserAttributes().addAll( ( Collection< ? extends UserAttribute > ) newValue );
            return;
        case CimPackage.TRANSACTION__METER:
            setMeter( ( Meter ) newValue );
            return;
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            setCashierShift( ( CashierShift ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__DIVERSE_REFERENCE:
            unsetDiverseReference();
            return;
        case CimPackage.TRANSACTION__DONOR_REFERENCE:
            unsetDonorReference();
            return;
        case CimPackage.TRANSACTION__KIND:
            unsetKind();
            return;
        case CimPackage.TRANSACTION__RECEIVER_REFERENCE:
            unsetReceiverReference();
            return;
        case CimPackage.TRANSACTION__REVERSED_ID:
            unsetReversedId();
            return;
        case CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
            unsetServiceUnitsEnergy();
            return;
        case CimPackage.TRANSACTION__SERVICE_UNITS_ERROR:
            unsetServiceUnitsError();
            return;
        case CimPackage.TRANSACTION__LINE:
            unsetLine();
            return;
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            unsetVendorShift();
            return;
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            unsetCustomerAccount();
            return;
        case CimPackage.TRANSACTION__RECEIPT:
            unsetReceipt();
            return;
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            unsetAuxiliaryAccount();
            return;
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            unsetPricingStructure();
            return;
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            unsetUserAttributes();
            return;
        case CimPackage.TRANSACTION__METER:
            unsetMeter();
            return;
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            unsetCashierShift();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.TRANSACTION__DIVERSE_REFERENCE:
            return isSetDiverseReference();
        case CimPackage.TRANSACTION__DONOR_REFERENCE:
            return isSetDonorReference();
        case CimPackage.TRANSACTION__KIND:
            return isSetKind();
        case CimPackage.TRANSACTION__RECEIVER_REFERENCE:
            return isSetReceiverReference();
        case CimPackage.TRANSACTION__REVERSED_ID:
            return isSetReversedId();
        case CimPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
            return isSetServiceUnitsEnergy();
        case CimPackage.TRANSACTION__SERVICE_UNITS_ERROR:
            return isSetServiceUnitsError();
        case CimPackage.TRANSACTION__LINE:
            return isSetLine();
        case CimPackage.TRANSACTION__VENDOR_SHIFT:
            return isSetVendorShift();
        case CimPackage.TRANSACTION__CUSTOMER_ACCOUNT:
            return isSetCustomerAccount();
        case CimPackage.TRANSACTION__RECEIPT:
            return isSetReceipt();
        case CimPackage.TRANSACTION__AUXILIARY_ACCOUNT:
            return isSetAuxiliaryAccount();
        case CimPackage.TRANSACTION__PRICING_STRUCTURE:
            return isSetPricingStructure();
        case CimPackage.TRANSACTION__USER_ATTRIBUTES:
            return isSetUserAttributes();
        case CimPackage.TRANSACTION__METER:
            return isSetMeter();
        case CimPackage.TRANSACTION__CASHIER_SHIFT:
            return isSetCashierShift();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (diverseReference: " );
        if( diverseReferenceESet )
            result.append( diverseReference );
        else
            result.append( "<unset>" );
        result.append( ", donorReference: " );
        if( donorReferenceESet )
            result.append( donorReference );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", receiverReference: " );
        if( receiverReferenceESet )
            result.append( receiverReference );
        else
            result.append( "<unset>" );
        result.append( ", reversedId: " );
        if( reversedIdESet )
            result.append( reversedId );
        else
            result.append( "<unset>" );
        result.append( ", serviceUnitsEnergy: " );
        if( serviceUnitsEnergyESet )
            result.append( serviceUnitsEnergy );
        else
            result.append( "<unset>" );
        result.append( ", serviceUnitsError: " );
        if( serviceUnitsErrorESet )
            result.append( serviceUnitsError );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransactionImpl
