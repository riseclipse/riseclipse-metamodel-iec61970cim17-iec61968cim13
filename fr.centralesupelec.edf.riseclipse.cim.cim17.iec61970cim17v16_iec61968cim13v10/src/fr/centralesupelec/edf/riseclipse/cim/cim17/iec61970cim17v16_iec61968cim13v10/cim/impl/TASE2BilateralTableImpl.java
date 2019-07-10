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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable;

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
 * An implementation of the model object '<em><b>TASE2 Bilateral Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TASE2BilateralTableImpl#getBilateralTableID <em>Bilateral Table ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TASE2BilateralTableImpl#getBilateralTableVersion <em>Bilateral Table Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TASE2BilateralTableImpl#getTase2version <em>Tase2version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TASE2BilateralTableImpl#getICCPInformationMessage <em>ICCP Information Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TASE2BilateralTableImpl extends BilateralExchangeAgreementImpl implements TASE2BilateralTable {
    /**
     * The default value of the '{@link #getBilateralTableID() <em>Bilateral Table ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralTableID()
     * @generated
     * @ordered
     */
    protected static final String BILATERAL_TABLE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBilateralTableID() <em>Bilateral Table ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralTableID()
     * @generated
     * @ordered
     */
    protected String bilateralTableID = BILATERAL_TABLE_ID_EDEFAULT;

    /**
     * This is true if the Bilateral Table ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bilateralTableIDESet;

    /**
     * The default value of the '{@link #getBilateralTableVersion() <em>Bilateral Table Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralTableVersion()
     * @generated
     * @ordered
     */
    protected static final String BILATERAL_TABLE_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBilateralTableVersion() <em>Bilateral Table Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralTableVersion()
     * @generated
     * @ordered
     */
    protected String bilateralTableVersion = BILATERAL_TABLE_VERSION_EDEFAULT;

    /**
     * This is true if the Bilateral Table Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bilateralTableVersionESet;

    /**
     * The default value of the '{@link #getTase2version() <em>Tase2version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTase2version()
     * @generated
     * @ordered
     */
    protected static final String TASE2VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTase2version() <em>Tase2version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTase2version()
     * @generated
     * @ordered
     */
    protected String tase2version = TASE2VERSION_EDEFAULT;

    /**
     * This is true if the Tase2version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tase2versionESet;

    /**
     * The cached value of the '{@link #getICCPInformationMessage() <em>ICCP Information Message</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getICCPInformationMessage()
     * @generated
     * @ordered
     */
    protected EList< ICCPInformationMessage > iccpInformationMessage;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TASE2BilateralTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTASE2BilateralTable();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBilateralTableID() {
        return bilateralTableID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBilateralTableID( String newBilateralTableID ) {
        String oldBilateralTableID = bilateralTableID;
        bilateralTableID = newBilateralTableID;
        boolean oldBilateralTableIDESet = bilateralTableIDESet;
        bilateralTableIDESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID,
                        oldBilateralTableID, bilateralTableID, !oldBilateralTableIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBilateralTableID() {
        String oldBilateralTableID = bilateralTableID;
        boolean oldBilateralTableIDESet = bilateralTableIDESet;
        bilateralTableID = BILATERAL_TABLE_ID_EDEFAULT;
        bilateralTableIDESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID,
                        oldBilateralTableID, BILATERAL_TABLE_ID_EDEFAULT, oldBilateralTableIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBilateralTableID() {
        return bilateralTableIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBilateralTableVersion() {
        return bilateralTableVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBilateralTableVersion( String newBilateralTableVersion ) {
        String oldBilateralTableVersion = bilateralTableVersion;
        bilateralTableVersion = newBilateralTableVersion;
        boolean oldBilateralTableVersionESet = bilateralTableVersionESet;
        bilateralTableVersionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION, oldBilateralTableVersion,
                bilateralTableVersion, !oldBilateralTableVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBilateralTableVersion() {
        String oldBilateralTableVersion = bilateralTableVersion;
        boolean oldBilateralTableVersionESet = bilateralTableVersionESet;
        bilateralTableVersion = BILATERAL_TABLE_VERSION_EDEFAULT;
        bilateralTableVersionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION, oldBilateralTableVersion,
                BILATERAL_TABLE_VERSION_EDEFAULT, oldBilateralTableVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBilateralTableVersion() {
        return bilateralTableVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTase2version() {
        return tase2version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTase2version( String newTase2version ) {
        String oldTase2version = tase2version;
        tase2version = newTase2version;
        boolean oldTase2versionESet = tase2versionESet;
        tase2versionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION, oldTase2version, tase2version, !oldTase2versionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTase2version() {
        String oldTase2version = tase2version;
        boolean oldTase2versionESet = tase2versionESet;
        tase2version = TASE2VERSION_EDEFAULT;
        tase2versionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION,
                    oldTase2version, TASE2VERSION_EDEFAULT, oldTase2versionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTase2version() {
        return tase2versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ICCPInformationMessage > getICCPInformationMessage() {
        if( iccpInformationMessage == null ) {
            iccpInformationMessage = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ICCPInformationMessage >(
                    ICCPInformationMessage.class, this, CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE,
                    CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE );
        }
        return iccpInformationMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetICCPInformationMessage() {
        if( iccpInformationMessage != null ) ( ( InternalEList.Unsettable< ? > ) iccpInformationMessage ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetICCPInformationMessage() {
        return iccpInformationMessage != null && ( ( InternalEList.Unsettable< ? > ) iccpInformationMessage ).isSet();
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
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getICCPInformationMessage() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            return ( ( InternalEList< ? > ) getICCPInformationMessage() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID:
            return getBilateralTableID();
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION:
            return getBilateralTableVersion();
        case CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION:
            return getTase2version();
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            return getICCPInformationMessage();
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
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID:
            setBilateralTableID( ( String ) newValue );
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION:
            setBilateralTableVersion( ( String ) newValue );
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION:
            setTase2version( ( String ) newValue );
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            getICCPInformationMessage().clear();
            getICCPInformationMessage().addAll( ( Collection< ? extends ICCPInformationMessage > ) newValue );
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
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID:
            unsetBilateralTableID();
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION:
            unsetBilateralTableVersion();
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION:
            unsetTase2version();
            return;
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            unsetICCPInformationMessage();
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
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_ID:
            return isSetBilateralTableID();
        case CimPackage.TASE2_BILATERAL_TABLE__BILATERAL_TABLE_VERSION:
            return isSetBilateralTableVersion();
        case CimPackage.TASE2_BILATERAL_TABLE__TASE2VERSION:
            return isSetTase2version();
        case CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE:
            return isSetICCPInformationMessage();
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
        result.append( " (bilateralTableID: " );
        if( bilateralTableIDESet )
            result.append( bilateralTableID );
        else
            result.append( "<unset>" );
        result.append( ", bilateralTableVersion: " );
        if( bilateralTableVersionESet )
            result.append( bilateralTableVersion );
        else
            result.append( "<unset>" );
        result.append( ", tase2version: " );
        if( tase2versionESet )
            result.append( tase2version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TASE2BilateralTableImpl
