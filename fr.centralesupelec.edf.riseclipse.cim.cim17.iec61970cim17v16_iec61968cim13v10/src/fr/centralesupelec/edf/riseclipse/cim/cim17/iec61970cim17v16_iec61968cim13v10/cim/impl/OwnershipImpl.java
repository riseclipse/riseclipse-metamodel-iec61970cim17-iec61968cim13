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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOwner;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OwnershipImpl#getShare <em>Share</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OwnershipImpl#getAssetOwner <em>Asset Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OwnershipImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwnershipImpl extends IdentifiedObjectImpl implements Ownership {
    /**
     * The default value of the '{@link #getShare() <em>Share</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShare()
     * @generated
     * @ordered
     */
    protected static final Float SHARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShare() <em>Share</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShare()
     * @generated
     * @ordered
     */
    protected Float share = SHARE_EDEFAULT;

    /**
     * This is true if the Share attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shareESet;

    /**
     * The cached value of the '{@link #getAssetOwner() <em>Asset Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetOwner()
     * @generated
     * @ordered
     */
    protected AssetOwner assetOwner;

    /**
     * This is true if the Asset Owner reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetOwnerESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnershipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOwnership();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShare() {
        return share;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShare( Float newShare ) {
        Float oldShare = share;
        share = newShare;
        boolean oldShareESet = shareESet;
        shareESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OWNERSHIP__SHARE, oldShare, share, !oldShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShare() {
        Float oldShare = share;
        boolean oldShareESet = shareESet;
        share = SHARE_EDEFAULT;
        shareESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OWNERSHIP__SHARE, oldShare, SHARE_EDEFAULT, oldShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShare() {
        return shareESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetOwner getAssetOwner() {
        return assetOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetOwner( AssetOwner newAssetOwner, NotificationChain msgs ) {
        AssetOwner oldAssetOwner = assetOwner;
        assetOwner = newAssetOwner;
        boolean oldAssetOwnerESet = assetOwnerESet;
        assetOwnerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OWNERSHIP__ASSET_OWNER, oldAssetOwner, newAssetOwner, !oldAssetOwnerESet );
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
    public void setAssetOwner( AssetOwner newAssetOwner ) {
        if( newAssetOwner != assetOwner ) {
            NotificationChain msgs = null;
            if( assetOwner != null ) msgs = ( ( InternalEObject ) assetOwner ).eInverseRemove( this,
                    CimPackage.ASSET_OWNER__OWNERSHIPS, AssetOwner.class, msgs );
            if( newAssetOwner != null ) msgs = ( ( InternalEObject ) newAssetOwner ).eInverseAdd( this,
                    CimPackage.ASSET_OWNER__OWNERSHIPS, AssetOwner.class, msgs );
            msgs = basicSetAssetOwner( newAssetOwner, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetOwnerESet = assetOwnerESet;
            assetOwnerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OWNERSHIP__ASSET_OWNER, newAssetOwner, newAssetOwner, !oldAssetOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetOwner( NotificationChain msgs ) {
        AssetOwner oldAssetOwner = assetOwner;
        assetOwner = null;
        boolean oldAssetOwnerESet = assetOwnerESet;
        assetOwnerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OWNERSHIP__ASSET_OWNER, oldAssetOwner, null, oldAssetOwnerESet );
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
    public void unsetAssetOwner() {
        if( assetOwner != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetOwner ).eInverseRemove( this, CimPackage.ASSET_OWNER__OWNERSHIPS,
                    AssetOwner.class, msgs );
            msgs = basicUnsetAssetOwner( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetOwnerESet = assetOwnerESet;
            assetOwnerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OWNERSHIP__ASSET_OWNER, null, null, oldAssetOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetOwner() {
        return assetOwnerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.OWNERSHIP__ASSET,
                    oldAsset, newAsset, !oldAssetESet );
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
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__OWNERSHIPS,
                    Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__OWNERSHIPS, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OWNERSHIP__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OWNERSHIP__ASSET, oldAsset, null, oldAssetESet );
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
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__OWNERSHIPS, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OWNERSHIP__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            if( assetOwner != null ) msgs = ( ( InternalEObject ) assetOwner ).eInverseRemove( this,
                    CimPackage.ASSET_OWNER__OWNERSHIPS, AssetOwner.class, msgs );
            return basicSetAssetOwner( ( AssetOwner ) otherEnd, msgs );
        case CimPackage.OWNERSHIP__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__OWNERSHIPS,
                    Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
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
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            return basicUnsetAssetOwner( msgs );
        case CimPackage.OWNERSHIP__ASSET:
            return basicUnsetAsset( msgs );
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
        case CimPackage.OWNERSHIP__SHARE:
            return getShare();
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            return getAssetOwner();
        case CimPackage.OWNERSHIP__ASSET:
            return getAsset();
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
        case CimPackage.OWNERSHIP__SHARE:
            setShare( ( Float ) newValue );
            return;
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            setAssetOwner( ( AssetOwner ) newValue );
            return;
        case CimPackage.OWNERSHIP__ASSET:
            setAsset( ( Asset ) newValue );
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
        case CimPackage.OWNERSHIP__SHARE:
            unsetShare();
            return;
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            unsetAssetOwner();
            return;
        case CimPackage.OWNERSHIP__ASSET:
            unsetAsset();
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
        case CimPackage.OWNERSHIP__SHARE:
            return isSetShare();
        case CimPackage.OWNERSHIP__ASSET_OWNER:
            return isSetAssetOwner();
        case CimPackage.OWNERSHIP__ASSET:
            return isSetAsset();
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
        result.append( " (share: " );
        if( shareESet )
            result.append( share );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OwnershipImpl
