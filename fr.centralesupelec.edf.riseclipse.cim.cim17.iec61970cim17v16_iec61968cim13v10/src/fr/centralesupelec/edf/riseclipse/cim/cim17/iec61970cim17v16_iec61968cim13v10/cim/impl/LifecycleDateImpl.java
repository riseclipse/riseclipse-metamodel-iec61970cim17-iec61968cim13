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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getManufacturedDate <em>Manufactured Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getPurchaseDate <em>Purchase Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getRemovalDate <em>Removal Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LifecycleDateImpl#getRetiredDate <em>Retired Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleDateImpl extends MinimalEObjectImpl.Container implements LifecycleDate {
    /**
     * The default value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallationDate()
     * @generated
     * @ordered
     */
    protected static final Date INSTALLATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallationDate()
     * @generated
     * @ordered
     */
    protected Date installationDate = INSTALLATION_DATE_EDEFAULT;

    /**
     * This is true if the Installation Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean installationDateESet;

    /**
     * The default value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturedDate()
     * @generated
     * @ordered
     */
    protected static final Date MANUFACTURED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturedDate()
     * @generated
     * @ordered
     */
    protected Date manufacturedDate = MANUFACTURED_DATE_EDEFAULT;

    /**
     * This is true if the Manufactured Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manufacturedDateESet;

    /**
     * The default value of the '{@link #getPurchaseDate() <em>Purchase Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseDate()
     * @generated
     * @ordered
     */
    protected static final Date PURCHASE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurchaseDate() <em>Purchase Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseDate()
     * @generated
     * @ordered
     */
    protected Date purchaseDate = PURCHASE_DATE_EDEFAULT;

    /**
     * This is true if the Purchase Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purchaseDateESet;

    /**
     * The default value of the '{@link #getReceivedDate() <em>Received Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceivedDate()
     * @generated
     * @ordered
     */
    protected static final Date RECEIVED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceivedDate() <em>Received Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceivedDate()
     * @generated
     * @ordered
     */
    protected Date receivedDate = RECEIVED_DATE_EDEFAULT;

    /**
     * This is true if the Received Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receivedDateESet;

    /**
     * The default value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemovalDate()
     * @generated
     * @ordered
     */
    protected static final Date REMOVAL_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemovalDate()
     * @generated
     * @ordered
     */
    protected Date removalDate = REMOVAL_DATE_EDEFAULT;

    /**
     * This is true if the Removal Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean removalDateESet;

    /**
     * The default value of the '{@link #getRetiredDate() <em>Retired Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetiredDate()
     * @generated
     * @ordered
     */
    protected static final Date RETIRED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRetiredDate() <em>Retired Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetiredDate()
     * @generated
     * @ordered
     */
    protected Date retiredDate = RETIRED_DATE_EDEFAULT;

    /**
     * This is true if the Retired Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retiredDateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifecycleDateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLifecycleDate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getInstallationDate() {
        return installationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstallationDate( Date newInstallationDate ) {
        Date oldInstallationDate = installationDate;
        installationDate = newInstallationDate;
        boolean oldInstallationDateESet = installationDateESet;
        installationDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE,
                    oldInstallationDate, installationDate, !oldInstallationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstallationDate() {
        Date oldInstallationDate = installationDate;
        boolean oldInstallationDateESet = installationDateESet;
        installationDate = INSTALLATION_DATE_EDEFAULT;
        installationDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE,
                    oldInstallationDate, INSTALLATION_DATE_EDEFAULT, oldInstallationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstallationDate() {
        return installationDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setManufacturedDate( Date newManufacturedDate ) {
        Date oldManufacturedDate = manufacturedDate;
        manufacturedDate = newManufacturedDate;
        boolean oldManufacturedDateESet = manufacturedDateESet;
        manufacturedDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE,
                    oldManufacturedDate, manufacturedDate, !oldManufacturedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetManufacturedDate() {
        Date oldManufacturedDate = manufacturedDate;
        boolean oldManufacturedDateESet = manufacturedDateESet;
        manufacturedDate = MANUFACTURED_DATE_EDEFAULT;
        manufacturedDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE,
                    oldManufacturedDate, MANUFACTURED_DATE_EDEFAULT, oldManufacturedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetManufacturedDate() {
        return manufacturedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurchaseDate( Date newPurchaseDate ) {
        Date oldPurchaseDate = purchaseDate;
        purchaseDate = newPurchaseDate;
        boolean oldPurchaseDateESet = purchaseDateESet;
        purchaseDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LIFECYCLE_DATE__PURCHASE_DATE, oldPurchaseDate, purchaseDate, !oldPurchaseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurchaseDate() {
        Date oldPurchaseDate = purchaseDate;
        boolean oldPurchaseDateESet = purchaseDateESet;
        purchaseDate = PURCHASE_DATE_EDEFAULT;
        purchaseDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LIFECYCLE_DATE__PURCHASE_DATE,
                    oldPurchaseDate, PURCHASE_DATE_EDEFAULT, oldPurchaseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurchaseDate() {
        return purchaseDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceivedDate( Date newReceivedDate ) {
        Date oldReceivedDate = receivedDate;
        receivedDate = newReceivedDate;
        boolean oldReceivedDateESet = receivedDateESet;
        receivedDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LIFECYCLE_DATE__RECEIVED_DATE, oldReceivedDate, receivedDate, !oldReceivedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceivedDate() {
        Date oldReceivedDate = receivedDate;
        boolean oldReceivedDateESet = receivedDateESet;
        receivedDate = RECEIVED_DATE_EDEFAULT;
        receivedDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LIFECYCLE_DATE__RECEIVED_DATE,
                    oldReceivedDate, RECEIVED_DATE_EDEFAULT, oldReceivedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceivedDate() {
        return receivedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getRemovalDate() {
        return removalDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemovalDate( Date newRemovalDate ) {
        Date oldRemovalDate = removalDate;
        removalDate = newRemovalDate;
        boolean oldRemovalDateESet = removalDateESet;
        removalDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LIFECYCLE_DATE__REMOVAL_DATE, oldRemovalDate, removalDate, !oldRemovalDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemovalDate() {
        Date oldRemovalDate = removalDate;
        boolean oldRemovalDateESet = removalDateESet;
        removalDate = REMOVAL_DATE_EDEFAULT;
        removalDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LIFECYCLE_DATE__REMOVAL_DATE, oldRemovalDate, REMOVAL_DATE_EDEFAULT, oldRemovalDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemovalDate() {
        return removalDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getRetiredDate() {
        return retiredDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRetiredDate( Date newRetiredDate ) {
        Date oldRetiredDate = retiredDate;
        retiredDate = newRetiredDate;
        boolean oldRetiredDateESet = retiredDateESet;
        retiredDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LIFECYCLE_DATE__RETIRED_DATE, oldRetiredDate, retiredDate, !oldRetiredDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRetiredDate() {
        Date oldRetiredDate = retiredDate;
        boolean oldRetiredDateESet = retiredDateESet;
        retiredDate = RETIRED_DATE_EDEFAULT;
        retiredDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LIFECYCLE_DATE__RETIRED_DATE, oldRetiredDate, RETIRED_DATE_EDEFAULT, oldRetiredDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRetiredDate() {
        return retiredDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE:
            return getInstallationDate();
        case CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE:
            return getManufacturedDate();
        case CimPackage.LIFECYCLE_DATE__PURCHASE_DATE:
            return getPurchaseDate();
        case CimPackage.LIFECYCLE_DATE__RECEIVED_DATE:
            return getReceivedDate();
        case CimPackage.LIFECYCLE_DATE__REMOVAL_DATE:
            return getRemovalDate();
        case CimPackage.LIFECYCLE_DATE__RETIRED_DATE:
            return getRetiredDate();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE:
            setInstallationDate( ( Date ) newValue );
            return;
        case CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE:
            setManufacturedDate( ( Date ) newValue );
            return;
        case CimPackage.LIFECYCLE_DATE__PURCHASE_DATE:
            setPurchaseDate( ( Date ) newValue );
            return;
        case CimPackage.LIFECYCLE_DATE__RECEIVED_DATE:
            setReceivedDate( ( Date ) newValue );
            return;
        case CimPackage.LIFECYCLE_DATE__REMOVAL_DATE:
            setRemovalDate( ( Date ) newValue );
            return;
        case CimPackage.LIFECYCLE_DATE__RETIRED_DATE:
            setRetiredDate( ( Date ) newValue );
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
        case CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE:
            unsetInstallationDate();
            return;
        case CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE:
            unsetManufacturedDate();
            return;
        case CimPackage.LIFECYCLE_DATE__PURCHASE_DATE:
            unsetPurchaseDate();
            return;
        case CimPackage.LIFECYCLE_DATE__RECEIVED_DATE:
            unsetReceivedDate();
            return;
        case CimPackage.LIFECYCLE_DATE__REMOVAL_DATE:
            unsetRemovalDate();
            return;
        case CimPackage.LIFECYCLE_DATE__RETIRED_DATE:
            unsetRetiredDate();
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
        case CimPackage.LIFECYCLE_DATE__INSTALLATION_DATE:
            return isSetInstallationDate();
        case CimPackage.LIFECYCLE_DATE__MANUFACTURED_DATE:
            return isSetManufacturedDate();
        case CimPackage.LIFECYCLE_DATE__PURCHASE_DATE:
            return isSetPurchaseDate();
        case CimPackage.LIFECYCLE_DATE__RECEIVED_DATE:
            return isSetReceivedDate();
        case CimPackage.LIFECYCLE_DATE__REMOVAL_DATE:
            return isSetRemovalDate();
        case CimPackage.LIFECYCLE_DATE__RETIRED_DATE:
            return isSetRetiredDate();
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
        result.append( " (installationDate: " );
        if( installationDateESet )
            result.append( installationDate );
        else
            result.append( "<unset>" );
        result.append( ", manufacturedDate: " );
        if( manufacturedDateESet )
            result.append( manufacturedDate );
        else
            result.append( "<unset>" );
        result.append( ", purchaseDate: " );
        if( purchaseDateESet )
            result.append( purchaseDate );
        else
            result.append( "<unset>" );
        result.append( ", receivedDate: " );
        if( receivedDateESet )
            result.append( receivedDate );
        else
            result.append( "<unset>" );
        result.append( ", removalDate: " );
        if( removalDateESet )
            result.append( removalDate );
        else
            result.append( "<unset>" );
        result.append( ", retiredDate: " );
        if( retiredDateESet )
            result.append( retiredDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LifecycleDateImpl
