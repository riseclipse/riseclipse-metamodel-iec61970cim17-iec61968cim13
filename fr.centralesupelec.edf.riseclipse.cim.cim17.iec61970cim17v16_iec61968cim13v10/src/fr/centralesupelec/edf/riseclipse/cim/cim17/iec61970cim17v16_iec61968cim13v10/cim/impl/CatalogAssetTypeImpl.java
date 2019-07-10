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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringQuantity;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Catalog Asset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getEstimatedUnitCost <em>Estimated Unit Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getStockItem <em>Stock Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CatalogAssetTypeImpl#getProductAssetModel <em>Product Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogAssetTypeImpl extends IdentifiedObjectImpl implements CatalogAssetType {
    /**
     * The default value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedUnitCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal ESTIMATED_UNIT_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedUnitCost()
     * @generated
     * @ordered
     */
    protected BigDecimal estimatedUnitCost = ESTIMATED_UNIT_COST_EDEFAULT;

    /**
     * This is true if the Estimated Unit Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedUnitCostESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final AssetKind KIND_EDEFAULT = AssetKind.BREAKER_AIR_BLAST_BREAKER;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AssetKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getStockItem() <em>Stock Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStockItem()
     * @generated
     * @ordered
     */
    protected static final Boolean STOCK_ITEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStockItem() <em>Stock Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStockItem()
     * @generated
     * @ordered
     */
    protected Boolean stockItem = STOCK_ITEM_EDEFAULT;

    /**
     * This is true if the Stock Item attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stockItemESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantity()
     * @generated
     * @ordered
     */
    protected StringQuantity quantity;

    /**
     * This is true if the Quantity containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean quantityESet;

    /**
     * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetInfo()
     * @generated
     * @ordered
     */
    protected AssetInfo assetInfo;

    /**
     * This is true if the Asset Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetInfoESet;

    /**
     * The cached value of the '{@link #getProductAssetModel() <em>Product Asset Model</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProductAssetModel()
     * @generated
     * @ordered
     */
    protected EList< ProductAssetModel > productAssetModel;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CatalogAssetTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCatalogAssetType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getEstimatedUnitCost() {
        return estimatedUnitCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEstimatedUnitCost( BigDecimal newEstimatedUnitCost ) {
        BigDecimal oldEstimatedUnitCost = estimatedUnitCost;
        estimatedUnitCost = newEstimatedUnitCost;
        boolean oldEstimatedUnitCostESet = estimatedUnitCostESet;
        estimatedUnitCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST,
                    oldEstimatedUnitCost, estimatedUnitCost, !oldEstimatedUnitCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEstimatedUnitCost() {
        BigDecimal oldEstimatedUnitCost = estimatedUnitCost;
        boolean oldEstimatedUnitCostESet = estimatedUnitCostESet;
        estimatedUnitCost = ESTIMATED_UNIT_COST_EDEFAULT;
        estimatedUnitCostESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST,
                        oldEstimatedUnitCost, ESTIMATED_UNIT_COST_EDEFAULT, oldEstimatedUnitCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedUnitCost() {
        return estimatedUnitCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AssetKind newKind ) {
        AssetKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CATALOG_ASSET_TYPE__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AssetKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CATALOG_ASSET_TYPE__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public Boolean getStockItem() {
        return stockItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStockItem( Boolean newStockItem ) {
        Boolean oldStockItem = stockItem;
        stockItem = newStockItem;
        boolean oldStockItemESet = stockItemESet;
        stockItemESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM, oldStockItem, stockItem, !oldStockItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStockItem() {
        Boolean oldStockItem = stockItem;
        boolean oldStockItemESet = stockItemESet;
        stockItem = STOCK_ITEM_EDEFAULT;
        stockItemESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM, oldStockItem, STOCK_ITEM_EDEFAULT, oldStockItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStockItem() {
        return stockItemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CATALOG_ASSET_TYPE__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CATALOG_ASSET_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringQuantity getQuantity() {
        return quantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQuantity( StringQuantity newQuantity, NotificationChain msgs ) {
        StringQuantity oldQuantity = quantity;
        quantity = newQuantity;
        boolean oldQuantityESet = quantityESet;
        quantityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CATALOG_ASSET_TYPE__QUANTITY, oldQuantity, newQuantity, !oldQuantityESet );
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
    public void setQuantity( StringQuantity newQuantity ) {
        if( newQuantity != quantity ) {
            NotificationChain msgs = null;
            if( quantity != null ) msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CATALOG_ASSET_TYPE__QUANTITY, null, msgs );
            if( newQuantity != null ) msgs = ( ( InternalEObject ) newQuantity ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CATALOG_ASSET_TYPE__QUANTITY, null, msgs );
            msgs = basicSetQuantity( newQuantity, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CATALOG_ASSET_TYPE__QUANTITY, newQuantity, newQuantity, !oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetQuantity( NotificationChain msgs ) {
        StringQuantity oldQuantity = quantity;
        quantity = null;
        boolean oldQuantityESet = quantityESet;
        quantityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CATALOG_ASSET_TYPE__QUANTITY, oldQuantity, null, oldQuantityESet );
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
    public void unsetQuantity() {
        if( quantity != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CATALOG_ASSET_TYPE__QUANTITY, null, msgs );
            msgs = basicUnsetQuantity( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CATALOG_ASSET_TYPE__QUANTITY, null, null, oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQuantity() {
        return quantityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetInfo( AssetInfo newAssetInfo, NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = newAssetInfo;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, oldAssetInfo, newAssetInfo, !oldAssetInfoESet );
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
    public void setAssetInfo( AssetInfo newAssetInfo ) {
        if( newAssetInfo != assetInfo ) {
            NotificationChain msgs = null;
            if( assetInfo != null ) msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, AssetInfo.class, msgs );
            if( newAssetInfo != null ) msgs = ( ( InternalEObject ) newAssetInfo ).eInverseAdd( this,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, AssetInfo.class, msgs );
            msgs = basicSetAssetInfo( newAssetInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, newAssetInfo, newAssetInfo, !oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetInfo( NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = null;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, oldAssetInfo, null, oldAssetInfoESet );
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
    public void unsetAssetInfo() {
        if( assetInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE,
                    AssetInfo.class, msgs );
            msgs = basicUnsetAssetInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO, null, null, oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetInfo() {
        return assetInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProductAssetModel > getProductAssetModel() {
        if( productAssetModel == null ) {
            productAssetModel = new EObjectWithInverseResolvingEList.Unsettable< ProductAssetModel >(
                    ProductAssetModel.class, this, CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL,
                    CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE );
        }
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProductAssetModel() {
        if( productAssetModel != null ) ( ( InternalEList.Unsettable< ? > ) productAssetModel ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProductAssetModel() {
        return productAssetModel != null && ( ( InternalEList.Unsettable< ? > ) productAssetModel ).isSet();
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
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            if( assetInfo != null ) msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__CATALOG_ASSET_TYPE, AssetInfo.class, msgs );
            return basicSetAssetInfo( ( AssetInfo ) otherEnd, msgs );
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProductAssetModel() )
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
        case CimPackage.CATALOG_ASSET_TYPE__QUANTITY:
            return basicUnsetQuantity( msgs );
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            return basicUnsetAssetInfo( msgs );
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
            return ( ( InternalEList< ? > ) getProductAssetModel() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST:
            return getEstimatedUnitCost();
        case CimPackage.CATALOG_ASSET_TYPE__KIND:
            return getKind();
        case CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM:
            return getStockItem();
        case CimPackage.CATALOG_ASSET_TYPE__TYPE:
            return getType();
        case CimPackage.CATALOG_ASSET_TYPE__QUANTITY:
            return getQuantity();
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            return getAssetInfo();
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
            return getProductAssetModel();
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
        case CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST:
            setEstimatedUnitCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__KIND:
            setKind( ( AssetKind ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM:
            setStockItem( ( Boolean ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__QUANTITY:
            setQuantity( ( StringQuantity ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            setAssetInfo( ( AssetInfo ) newValue );
            return;
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
            getProductAssetModel().clear();
            getProductAssetModel().addAll( ( Collection< ? extends ProductAssetModel > ) newValue );
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
        case CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST:
            unsetEstimatedUnitCost();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__KIND:
            unsetKind();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM:
            unsetStockItem();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__TYPE:
            unsetType();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__QUANTITY:
            unsetQuantity();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            unsetAssetInfo();
            return;
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
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
        case CimPackage.CATALOG_ASSET_TYPE__ESTIMATED_UNIT_COST:
            return isSetEstimatedUnitCost();
        case CimPackage.CATALOG_ASSET_TYPE__KIND:
            return isSetKind();
        case CimPackage.CATALOG_ASSET_TYPE__STOCK_ITEM:
            return isSetStockItem();
        case CimPackage.CATALOG_ASSET_TYPE__TYPE:
            return isSetType();
        case CimPackage.CATALOG_ASSET_TYPE__QUANTITY:
            return isSetQuantity();
        case CimPackage.CATALOG_ASSET_TYPE__ASSET_INFO:
            return isSetAssetInfo();
        case CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL:
            return isSetProductAssetModel();
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
        result.append( " (estimatedUnitCost: " );
        if( estimatedUnitCostESet )
            result.append( estimatedUnitCost );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", stockItem: " );
        if( stockItemESet )
            result.append( stockItem );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CatalogAssetTypeImpl
