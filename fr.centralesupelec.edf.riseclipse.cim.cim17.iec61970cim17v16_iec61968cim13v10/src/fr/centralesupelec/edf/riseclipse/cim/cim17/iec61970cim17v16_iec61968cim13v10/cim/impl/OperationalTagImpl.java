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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TagAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalTagImpl#getTagAction <em>Tag Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalTagImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalTagImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalTagImpl extends DocumentImpl implements OperationalTag {
    /**
     * The cached value of the '{@link #getTagAction() <em>Tag Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTagAction()
     * @generated
     * @ordered
     */
    protected TagAction tagAction;

    /**
     * This is true if the Tag Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tagActionESet;

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
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalTagImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalTag();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TagAction getTagAction() {
        return tagAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTagAction( TagAction newTagAction, NotificationChain msgs ) {
        TagAction oldTagAction = tagAction;
        tagAction = newTagAction;
        boolean oldTagActionESet = tagActionESet;
        tagActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_TAG__TAG_ACTION, oldTagAction, newTagAction, !oldTagActionESet );
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
    public void setTagAction( TagAction newTagAction ) {
        if( newTagAction != tagAction ) {
            NotificationChain msgs = null;
            if( tagAction != null ) msgs = ( ( InternalEObject ) tagAction ).eInverseRemove( this,
                    CimPackage.TAG_ACTION__OPERATIONAL_TAG, TagAction.class, msgs );
            if( newTagAction != null ) msgs = ( ( InternalEObject ) newTagAction ).eInverseAdd( this,
                    CimPackage.TAG_ACTION__OPERATIONAL_TAG, TagAction.class, msgs );
            msgs = basicSetTagAction( newTagAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTagActionESet = tagActionESet;
            tagActionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_TAG__TAG_ACTION, newTagAction, newTagAction, !oldTagActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTagAction( NotificationChain msgs ) {
        TagAction oldTagAction = tagAction;
        tagAction = null;
        boolean oldTagActionESet = tagActionESet;
        tagActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_TAG__TAG_ACTION, oldTagAction, null, oldTagActionESet );
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
    public void unsetTagAction() {
        if( tagAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) tagAction ).eInverseRemove( this, CimPackage.TAG_ACTION__OPERATIONAL_TAG,
                    TagAction.class, msgs );
            msgs = basicUnsetTagAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTagActionESet = tagActionESet;
            tagActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_TAG__TAG_ACTION, null, null, oldTagActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTagAction() {
        return tagActionESet;
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_TAG__ASSET, oldAsset, newAsset, !oldAssetESet );
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
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__OPERATIONAL_TAGS, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__OPERATIONAL_TAGS, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_TAG__ASSET, newAsset, newAsset, !oldAssetESet ) );
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
                    CimPackage.OPERATIONAL_TAG__ASSET, oldAsset, null, oldAssetESet );
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
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__OPERATIONAL_TAGS, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_TAG__ASSET, null, null, oldAssetESet ) );
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
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
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
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null )
                msgs = ( ( InternalEObject ) newPowerSystemResource ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE,
                            newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
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
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE, null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            if( tagAction != null ) msgs = ( ( InternalEObject ) tagAction ).eInverseRemove( this,
                    CimPackage.TAG_ACTION__OPERATIONAL_TAG, TagAction.class, msgs );
            return basicSetTagAction( ( TagAction ) otherEnd, msgs );
        case CimPackage.OPERATIONAL_TAG__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__OPERATIONAL_TAGS, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            return basicUnsetTagAction( msgs );
        case CimPackage.OPERATIONAL_TAG__ASSET:
            return basicUnsetAsset( msgs );
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
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
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            return getTagAction();
        case CimPackage.OPERATIONAL_TAG__ASSET:
            return getAsset();
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
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
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            setTagAction( ( TagAction ) newValue );
            return;
        case CimPackage.OPERATIONAL_TAG__ASSET:
            setAsset( ( Asset ) newValue );
            return;
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
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
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            unsetTagAction();
            return;
        case CimPackage.OPERATIONAL_TAG__ASSET:
            unsetAsset();
            return;
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
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
        case CimPackage.OPERATIONAL_TAG__TAG_ACTION:
            return isSetTagAction();
        case CimPackage.OPERATIONAL_TAG__ASSET:
            return isSetAsset();
        case CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        }
        return super.eIsSet( featureID );
    }

} //OperationalTagImpl
