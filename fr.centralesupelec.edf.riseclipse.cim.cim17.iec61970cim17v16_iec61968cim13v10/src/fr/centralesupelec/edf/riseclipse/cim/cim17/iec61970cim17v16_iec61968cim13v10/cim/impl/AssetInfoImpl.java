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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel;

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
 * An implementation of the model object '<em><b>Asset Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetInfoImpl#getCatalogAssetType <em>Catalog Asset Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetInfoImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetInfoImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetInfoImpl#getProductAssetModel <em>Product Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetInfoImpl extends IdentifiedObjectImpl implements AssetInfo {
    /**
     * The cached value of the '{@link #getCatalogAssetType() <em>Catalog Asset Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogAssetType()
     * @generated
     * @ordered
     */
    protected CatalogAssetType catalogAssetType;

    /**
     * This is true if the Catalog Asset Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean catalogAssetTypeESet;

    /**
     * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResources()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > powerSystemResources;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * The cached value of the '{@link #getProductAssetModel() <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProductAssetModel()
     * @generated
     * @ordered
     */
    protected ProductAssetModel productAssetModel;

    /**
     * This is true if the Product Asset Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean productAssetModelESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CatalogAssetType getCatalogAssetType() {
        if( catalogAssetType != null && catalogAssetType.eIsProxy() ) {
            InternalEObject oldCatalogAssetType = ( InternalEObject ) catalogAssetType;
            catalogAssetType = ( CatalogAssetType ) eResolveProxy( oldCatalogAssetType );
            if( catalogAssetType != oldCatalogAssetType ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, oldCatalogAssetType, catalogAssetType ) );
            }
        }
        return catalogAssetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatalogAssetType basicGetCatalogAssetType() {
        return catalogAssetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCatalogAssetType( CatalogAssetType newCatalogAssetType, NotificationChain msgs ) {
        CatalogAssetType oldCatalogAssetType = catalogAssetType;
        catalogAssetType = newCatalogAssetType;
        boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
        catalogAssetTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, oldCatalogAssetType, newCatalogAssetType,
                    !oldCatalogAssetTypeESet );
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
    public void setCatalogAssetType( CatalogAssetType newCatalogAssetType ) {
        if( newCatalogAssetType != catalogAssetType ) {
            NotificationChain msgs = null;
            if( catalogAssetType != null ) msgs = ( ( InternalEObject ) catalogAssetType ).eInverseRemove( this,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, CatalogAssetType.class, msgs );
            if( newCatalogAssetType != null ) msgs = ( ( InternalEObject ) newCatalogAssetType ).eInverseAdd( this,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, CatalogAssetType.class, msgs );
            msgs = basicSetCatalogAssetType( newCatalogAssetType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
            catalogAssetTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE,
                        newCatalogAssetType, newCatalogAssetType, !oldCatalogAssetTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCatalogAssetType( NotificationChain msgs ) {
        CatalogAssetType oldCatalogAssetType = catalogAssetType;
        catalogAssetType = null;
        boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
        catalogAssetTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, oldCatalogAssetType, null, oldCatalogAssetTypeESet );
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
    public void unsetCatalogAssetType() {
        if( catalogAssetType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) catalogAssetType ).eInverseRemove( this,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, CatalogAssetType.class, msgs );
            msgs = basicUnsetCatalogAssetType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
            catalogAssetTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, null, null, oldCatalogAssetTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCatalogAssetType() {
        return catalogAssetTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResources() {
        if( powerSystemResources == null ) {
            powerSystemResources = new EObjectWithInverseResolvingEList.Unsettable< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET );
        }
        return powerSystemResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResources() {
        if( powerSystemResources != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResources() {
        return powerSystemResources != null && ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable< Asset >( Asset.class, this,
                    CimPackage.ASSET_INFO__ASSETS, CimPackage.ASSET__ASSET_INFO );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProductAssetModel getProductAssetModel() {
        if( productAssetModel != null && productAssetModel.eIsProxy() ) {
            InternalEObject oldProductAssetModel = ( InternalEObject ) productAssetModel;
            productAssetModel = ( ProductAssetModel ) eResolveProxy( oldProductAssetModel );
            if( productAssetModel != oldProductAssetModel ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, oldProductAssetModel, productAssetModel ) );
            }
        }
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductAssetModel basicGetProductAssetModel() {
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProductAssetModel( ProductAssetModel newProductAssetModel,
            NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = newProductAssetModel;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, oldProductAssetModel, newProductAssetModel,
                    !oldProductAssetModelESet );
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
    public void setProductAssetModel( ProductAssetModel newProductAssetModel ) {
        if( newProductAssetModel != productAssetModel ) {
            NotificationChain msgs = null;
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, ProductAssetModel.class, msgs );
            if( newProductAssetModel != null ) msgs = ( ( InternalEObject ) newProductAssetModel ).eInverseAdd( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, ProductAssetModel.class, msgs );
            msgs = basicSetProductAssetModel( newProductAssetModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL,
                        newProductAssetModel, newProductAssetModel, !oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProductAssetModel( NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = null;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, oldProductAssetModel, null, oldProductAssetModelESet );
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
    public void unsetProductAssetModel() {
        if( productAssetModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, ProductAssetModel.class, msgs );
            msgs = basicUnsetProductAssetModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, null, null, oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProductAssetModel() {
        return productAssetModelESet;
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            if( catalogAssetType != null ) msgs = ( ( InternalEObject ) catalogAssetType ).eInverseRemove( this,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, CatalogAssetType.class, msgs );
            return basicSetCatalogAssetType( ( CatalogAssetType ) otherEnd, msgs );
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResources() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET_INFO__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, ProductAssetModel.class, msgs );
            return basicSetProductAssetModel( ( ProductAssetModel ) otherEnd, msgs );
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            return basicUnsetCatalogAssetType( msgs );
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< ? > ) getPowerSystemResources() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET_INFO__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            return basicUnsetProductAssetModel( msgs );
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            if( resolve ) return getCatalogAssetType();
            return basicGetCatalogAssetType();
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.ASSET_INFO__ASSETS:
            return getAssets();
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            if( resolve ) return getProductAssetModel();
            return basicGetProductAssetModel();
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            setCatalogAssetType( ( CatalogAssetType ) newValue );
            return;
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            getPowerSystemResources().clear();
            getPowerSystemResources().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
            return;
        case CimPackage.ASSET_INFO__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            setProductAssetModel( ( ProductAssetModel ) newValue );
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            unsetCatalogAssetType();
            return;
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.ASSET_INFO__ASSETS:
            unsetAssets();
            return;
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            unsetProductAssetModel();
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
        case CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE:
            return isSetCatalogAssetType();
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.ASSET_INFO__ASSETS:
            return isSetAssets();
        case CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL:
            return isSetProductAssetModel();
        }
        return super.eIsSet( featureID );
    }

} //AssetInfoImpl
