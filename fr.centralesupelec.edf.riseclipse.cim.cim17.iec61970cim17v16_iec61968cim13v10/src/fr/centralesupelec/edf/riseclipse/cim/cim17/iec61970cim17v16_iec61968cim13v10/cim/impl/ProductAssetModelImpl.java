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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetModelUsageKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CorporateStandardKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Manufacturer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction;
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
 * An implementation of the model object '<em><b>Product Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getCatalogueNumber <em>Catalogue Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getDrawingNumber <em>Drawing Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getInstructionManual <em>Instruction Manual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getOverallLength <em>Overall Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getStyleNumber <em>Style Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getWeightTotal <em>Weight Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getCatalogAssetType <em>Catalog Asset Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProductAssetModelImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductAssetModelImpl extends IdentifiedObjectImpl implements ProductAssetModel {
    /**
     * The default value of the '{@link #getCatalogueNumber() <em>Catalogue Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogueNumber()
     * @generated
     * @ordered
     */
    protected static final String CATALOGUE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCatalogueNumber() <em>Catalogue Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogueNumber()
     * @generated
     * @ordered
     */
    protected String catalogueNumber = CATALOGUE_NUMBER_EDEFAULT;

    /**
     * This is true if the Catalogue Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean catalogueNumberESet;

    /**
     * The default value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateStandardKind()
     * @generated
     * @ordered
     */
    protected static final CorporateStandardKind CORPORATE_STANDARD_KIND_EDEFAULT = CorporateStandardKind.STANDARD;

    /**
     * The cached value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateStandardKind()
     * @generated
     * @ordered
     */
    protected CorporateStandardKind corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;

    /**
     * This is true if the Corporate Standard Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean corporateStandardKindESet;

    /**
     * The default value of the '{@link #getDrawingNumber() <em>Drawing Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingNumber()
     * @generated
     * @ordered
     */
    protected static final String DRAWING_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrawingNumber() <em>Drawing Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingNumber()
     * @generated
     * @ordered
     */
    protected String drawingNumber = DRAWING_NUMBER_EDEFAULT;

    /**
     * This is true if the Drawing Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drawingNumberESet;

    /**
     * The default value of the '{@link #getInstructionManual() <em>Instruction Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstructionManual()
     * @generated
     * @ordered
     */
    protected static final String INSTRUCTION_MANUAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstructionManual() <em>Instruction Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstructionManual()
     * @generated
     * @ordered
     */
    protected String instructionManual = INSTRUCTION_MANUAL_EDEFAULT;

    /**
     * This is true if the Instruction Manual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instructionManualESet;

    /**
     * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelNumber()
     * @generated
     * @ordered
     */
    protected static final String MODEL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelNumber()
     * @generated
     * @ordered
     */
    protected String modelNumber = MODEL_NUMBER_EDEFAULT;

    /**
     * This is true if the Model Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelNumberESet;

    /**
     * The default value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelVersion()
     * @generated
     * @ordered
     */
    protected static final String MODEL_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelVersion()
     * @generated
     * @ordered
     */
    protected String modelVersion = MODEL_VERSION_EDEFAULT;

    /**
     * This is true if the Model Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelVersionESet;

    /**
     * The default value of the '{@link #getOverallLength() <em>Overall Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverallLength()
     * @generated
     * @ordered
     */
    protected static final Float OVERALL_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOverallLength() <em>Overall Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverallLength()
     * @generated
     * @ordered
     */
    protected Float overallLength = OVERALL_LENGTH_EDEFAULT;

    /**
     * This is true if the Overall Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean overallLengthESet;

    /**
     * The default value of the '{@link #getStyleNumber() <em>Style Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyleNumber()
     * @generated
     * @ordered
     */
    protected static final String STYLE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStyleNumber() <em>Style Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyleNumber()
     * @generated
     * @ordered
     */
    protected String styleNumber = STYLE_NUMBER_EDEFAULT;

    /**
     * This is true if the Style Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean styleNumberESet;

    /**
     * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected static final AssetModelUsageKind USAGE_KIND_EDEFAULT = AssetModelUsageKind.DISTRIBUTION_OVERHEAD;

    /**
     * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected AssetModelUsageKind usageKind = USAGE_KIND_EDEFAULT;

    /**
     * This is true if the Usage Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usageKindESet;

    /**
     * The default value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeightTotal()
     * @generated
     * @ordered
     */
    protected static final Float WEIGHT_TOTAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeightTotal()
     * @generated
     * @ordered
     */
    protected Float weightTotal = WEIGHT_TOTAL_EDEFAULT;

    /**
     * This is true if the Weight Total attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean weightTotalESet;

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
     * The cached value of the '{@link #getOperationalRestrictions() <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalRestrictions()
     * @generated
     * @ordered
     */
    protected EList< OperationalRestriction > operationalRestrictions;

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
     * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturer()
     * @generated
     * @ordered
     */
    protected Manufacturer manufacturer;

    /**
     * This is true if the Manufacturer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manufacturerESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected EList< Asset > asset;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductAssetModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProductAssetModel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCatalogueNumber( String newCatalogueNumber ) {
        String oldCatalogueNumber = catalogueNumber;
        catalogueNumber = newCatalogueNumber;
        boolean oldCatalogueNumberESet = catalogueNumberESet;
        catalogueNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER,
                    oldCatalogueNumber, catalogueNumber, !oldCatalogueNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCatalogueNumber() {
        String oldCatalogueNumber = catalogueNumber;
        boolean oldCatalogueNumberESet = catalogueNumberESet;
        catalogueNumber = CATALOGUE_NUMBER_EDEFAULT;
        catalogueNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER,
                    oldCatalogueNumber, CATALOGUE_NUMBER_EDEFAULT, oldCatalogueNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCatalogueNumber() {
        return catalogueNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CorporateStandardKind getCorporateStandardKind() {
        return corporateStandardKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCorporateStandardKind( CorporateStandardKind newCorporateStandardKind ) {
        CorporateStandardKind oldCorporateStandardKind = corporateStandardKind;
        corporateStandardKind = newCorporateStandardKind == null ? CORPORATE_STANDARD_KIND_EDEFAULT
                : newCorporateStandardKind;
        boolean oldCorporateStandardKindESet = corporateStandardKindESet;
        corporateStandardKindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND,
                        oldCorporateStandardKind, corporateStandardKind, !oldCorporateStandardKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCorporateStandardKind() {
        CorporateStandardKind oldCorporateStandardKind = corporateStandardKind;
        boolean oldCorporateStandardKindESet = corporateStandardKindESet;
        corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;
        corporateStandardKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND, oldCorporateStandardKind,
                CORPORATE_STANDARD_KIND_EDEFAULT, oldCorporateStandardKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCorporateStandardKind() {
        return corporateStandardKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDrawingNumber() {
        return drawingNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrawingNumber( String newDrawingNumber ) {
        String oldDrawingNumber = drawingNumber;
        drawingNumber = newDrawingNumber;
        boolean oldDrawingNumberESet = drawingNumberESet;
        drawingNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER,
                    oldDrawingNumber, drawingNumber, !oldDrawingNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrawingNumber() {
        String oldDrawingNumber = drawingNumber;
        boolean oldDrawingNumberESet = drawingNumberESet;
        drawingNumber = DRAWING_NUMBER_EDEFAULT;
        drawingNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER,
                    oldDrawingNumber, DRAWING_NUMBER_EDEFAULT, oldDrawingNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrawingNumber() {
        return drawingNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInstructionManual() {
        return instructionManual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstructionManual( String newInstructionManual ) {
        String oldInstructionManual = instructionManual;
        instructionManual = newInstructionManual;
        boolean oldInstructionManualESet = instructionManualESet;
        instructionManualESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL,
                    oldInstructionManual, instructionManual, !oldInstructionManualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstructionManual() {
        String oldInstructionManual = instructionManual;
        boolean oldInstructionManualESet = instructionManualESet;
        instructionManual = INSTRUCTION_MANUAL_EDEFAULT;
        instructionManualESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL,
                        oldInstructionManual, INSTRUCTION_MANUAL_EDEFAULT, oldInstructionManualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstructionManual() {
        return instructionManualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelNumber( String newModelNumber ) {
        String oldModelNumber = modelNumber;
        modelNumber = newModelNumber;
        boolean oldModelNumberESet = modelNumberESet;
        modelNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER, oldModelNumber, modelNumber, !oldModelNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelNumber() {
        String oldModelNumber = modelNumber;
        boolean oldModelNumberESet = modelNumberESet;
        modelNumber = MODEL_NUMBER_EDEFAULT;
        modelNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER,
                    oldModelNumber, MODEL_NUMBER_EDEFAULT, oldModelNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelNumber() {
        return modelNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelVersion( String newModelVersion ) {
        String oldModelVersion = modelVersion;
        modelVersion = newModelVersion;
        boolean oldModelVersionESet = modelVersionESet;
        modelVersionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION, oldModelVersion, modelVersion, !oldModelVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelVersion() {
        String oldModelVersion = modelVersion;
        boolean oldModelVersionESet = modelVersionESet;
        modelVersion = MODEL_VERSION_EDEFAULT;
        modelVersionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION,
                    oldModelVersion, MODEL_VERSION_EDEFAULT, oldModelVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelVersion() {
        return modelVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOverallLength() {
        return overallLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverallLength( Float newOverallLength ) {
        Float oldOverallLength = overallLength;
        overallLength = newOverallLength;
        boolean oldOverallLengthESet = overallLengthESet;
        overallLengthESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH,
                    oldOverallLength, overallLength, !oldOverallLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOverallLength() {
        Float oldOverallLength = overallLength;
        boolean oldOverallLengthESet = overallLengthESet;
        overallLength = OVERALL_LENGTH_EDEFAULT;
        overallLengthESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH,
                    oldOverallLength, OVERALL_LENGTH_EDEFAULT, oldOverallLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOverallLength() {
        return overallLengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStyleNumber() {
        return styleNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStyleNumber( String newStyleNumber ) {
        String oldStyleNumber = styleNumber;
        styleNumber = newStyleNumber;
        boolean oldStyleNumberESet = styleNumberESet;
        styleNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER, oldStyleNumber, styleNumber, !oldStyleNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStyleNumber() {
        String oldStyleNumber = styleNumber;
        boolean oldStyleNumberESet = styleNumberESet;
        styleNumber = STYLE_NUMBER_EDEFAULT;
        styleNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER,
                    oldStyleNumber, STYLE_NUMBER_EDEFAULT, oldStyleNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStyleNumber() {
        return styleNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetModelUsageKind getUsageKind() {
        return usageKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsageKind( AssetModelUsageKind newUsageKind ) {
        AssetModelUsageKind oldUsageKind = usageKind;
        usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND, oldUsageKind, usageKind, !oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsageKind() {
        AssetModelUsageKind oldUsageKind = usageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKind = USAGE_KIND_EDEFAULT;
        usageKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND, oldUsageKind, USAGE_KIND_EDEFAULT, oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsageKind() {
        return usageKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWeightTotal() {
        return weightTotal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeightTotal( Float newWeightTotal ) {
        Float oldWeightTotal = weightTotal;
        weightTotal = newWeightTotal;
        boolean oldWeightTotalESet = weightTotalESet;
        weightTotalESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL, oldWeightTotal, weightTotal, !oldWeightTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWeightTotal() {
        Float oldWeightTotal = weightTotal;
        boolean oldWeightTotalESet = weightTotalESet;
        weightTotal = WEIGHT_TOTAL_EDEFAULT;
        weightTotalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL,
                    oldWeightTotal, WEIGHT_TOTAL_EDEFAULT, oldWeightTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWeightTotal() {
        return weightTotalESet;
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
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, oldAssetInfo, newAssetInfo, !oldAssetInfoESet );
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
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, AssetInfo.class, msgs );
            if( newAssetInfo != null ) msgs = ( ( InternalEObject ) newAssetInfo ).eInverseAdd( this,
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, AssetInfo.class, msgs );
            msgs = basicSetAssetInfo( newAssetInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, newAssetInfo, newAssetInfo, !oldAssetInfoESet ) );
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
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, oldAssetInfo, null, oldAssetInfoESet );
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
            msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL,
                    AssetInfo.class, msgs );
            msgs = basicUnsetAssetInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO, null, null, oldAssetInfoESet ) );
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
    public EList< OperationalRestriction > getOperationalRestrictions() {
        if( operationalRestrictions == null ) {
            operationalRestrictions = new EObjectWithInverseResolvingEList.Unsettable< OperationalRestriction >(
                    OperationalRestriction.class, this, CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL );
        }
        return operationalRestrictions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalRestrictions() {
        if( operationalRestrictions != null ) ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalRestrictions() {
        return operationalRestrictions != null && ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CatalogAssetType getCatalogAssetType() {
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
                    CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE, oldCatalogAssetType, newCatalogAssetType,
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
                    CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL, CatalogAssetType.class, msgs );
            if( newCatalogAssetType != null ) msgs = ( ( InternalEObject ) newCatalogAssetType ).eInverseAdd( this,
                    CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL, CatalogAssetType.class, msgs );
            msgs = basicSetCatalogAssetType( newCatalogAssetType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
            catalogAssetTypeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE,
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
                    CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE, oldCatalogAssetType, null,
                    oldCatalogAssetTypeESet );
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
                    CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL, CatalogAssetType.class, msgs );
            msgs = basicUnsetCatalogAssetType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCatalogAssetTypeESet = catalogAssetTypeESet;
            catalogAssetTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE, null, null, oldCatalogAssetTypeESet ) );
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
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManufacturer( Manufacturer newManufacturer, NotificationChain msgs ) {
        Manufacturer oldManufacturer = manufacturer;
        manufacturer = newManufacturer;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER, oldManufacturer, newManufacturer,
                    !oldManufacturerESet );
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
    public void setManufacturer( Manufacturer newManufacturer ) {
        if( newManufacturer != manufacturer ) {
            NotificationChain msgs = null;
            if( manufacturer != null ) msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                    CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            if( newManufacturer != null ) msgs = ( ( InternalEObject ) newManufacturer ).eInverseAdd( this,
                    CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            msgs = basicSetManufacturer( newManufacturer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldManufacturerESet = manufacturerESet;
            manufacturerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER,
                        newManufacturer, newManufacturer, !oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetManufacturer( NotificationChain msgs ) {
        Manufacturer oldManufacturer = manufacturer;
        manufacturer = null;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER, oldManufacturer, null, oldManufacturerESet );
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
    public void unsetManufacturer() {
        if( manufacturer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                    CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            msgs = basicUnsetManufacturer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldManufacturerESet = manufacturerESet;
            manufacturerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER, null, null, oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetManufacturer() {
        return manufacturerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAsset() {
        if( asset == null ) {
            asset = new EObjectWithInverseResolvingEList.Unsettable< Asset >( Asset.class, this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET, CimPackage.ASSET__PRODUCT_ASSET_MODEL );
        }
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsset() {
        if( asset != null ) ( ( InternalEList.Unsettable< ? > ) asset ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return asset != null && ( ( InternalEList.Unsettable< ? > ) asset ).isSet();
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
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            if( assetInfo != null ) msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__PRODUCT_ASSET_MODEL, AssetInfo.class, msgs );
            return basicSetAssetInfo( ( AssetInfo ) otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalRestrictions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            if( catalogAssetType != null ) msgs = ( ( InternalEObject ) catalogAssetType ).eInverseRemove( this,
                    CimPackage.CATALOG_ASSET_TYPE__PRODUCT_ASSET_MODEL, CatalogAssetType.class, msgs );
            return basicSetCatalogAssetType( ( CatalogAssetType ) otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            if( manufacturer != null ) msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                    CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            return basicSetManufacturer( ( Manufacturer ) otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAsset() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            return basicUnsetAssetInfo( msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< ? > ) getOperationalRestrictions() ).basicRemove( otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            return basicUnsetCatalogAssetType( msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return basicUnsetManufacturer( msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
            return ( ( InternalEList< ? > ) getAsset() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER:
            return getCatalogueNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            return getCorporateStandardKind();
        case CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER:
            return getDrawingNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL:
            return getInstructionManual();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            return getModelNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            return getModelVersion();
        case CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH:
            return getOverallLength();
        case CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER:
            return getStyleNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            return getUsageKind();
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            return getWeightTotal();
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            return getAssetInfo();
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return getOperationalRestrictions();
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            return getCatalogAssetType();
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return getManufacturer();
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
            return getAsset();
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
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER:
            setCatalogueNumber( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            setCorporateStandardKind( ( CorporateStandardKind ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER:
            setDrawingNumber( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL:
            setInstructionManual( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            setModelNumber( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            setModelVersion( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH:
            setOverallLength( ( Float ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER:
            setStyleNumber( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            setUsageKind( ( AssetModelUsageKind ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            setWeightTotal( ( Float ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            setAssetInfo( ( AssetInfo ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            getOperationalRestrictions().clear();
            getOperationalRestrictions().addAll( ( Collection< ? extends OperationalRestriction > ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            setCatalogAssetType( ( CatalogAssetType ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            setManufacturer( ( Manufacturer ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
            getAsset().clear();
            getAsset().addAll( ( Collection< ? extends Asset > ) newValue );
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
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER:
            unsetCatalogueNumber();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            unsetCorporateStandardKind();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER:
            unsetDrawingNumber();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL:
            unsetInstructionManual();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            unsetModelNumber();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            unsetModelVersion();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH:
            unsetOverallLength();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER:
            unsetStyleNumber();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            unsetUsageKind();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            unsetWeightTotal();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            unsetAssetInfo();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            unsetOperationalRestrictions();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            unsetCatalogAssetType();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            unsetManufacturer();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
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
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER:
            return isSetCatalogueNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            return isSetCorporateStandardKind();
        case CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER:
            return isSetDrawingNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL:
            return isSetInstructionManual();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            return isSetModelNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            return isSetModelVersion();
        case CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH:
            return isSetOverallLength();
        case CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER:
            return isSetStyleNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            return isSetUsageKind();
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            return isSetWeightTotal();
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET_INFO:
            return isSetAssetInfo();
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return isSetOperationalRestrictions();
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOG_ASSET_TYPE:
            return isSetCatalogAssetType();
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return isSetManufacturer();
        case CimPackage.PRODUCT_ASSET_MODEL__ASSET:
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
        result.append( " (catalogueNumber: " );
        if( catalogueNumberESet )
            result.append( catalogueNumber );
        else
            result.append( "<unset>" );
        result.append( ", corporateStandardKind: " );
        if( corporateStandardKindESet )
            result.append( corporateStandardKind );
        else
            result.append( "<unset>" );
        result.append( ", drawingNumber: " );
        if( drawingNumberESet )
            result.append( drawingNumber );
        else
            result.append( "<unset>" );
        result.append( ", instructionManual: " );
        if( instructionManualESet )
            result.append( instructionManual );
        else
            result.append( "<unset>" );
        result.append( ", modelNumber: " );
        if( modelNumberESet )
            result.append( modelNumber );
        else
            result.append( "<unset>" );
        result.append( ", modelVersion: " );
        if( modelVersionESet )
            result.append( modelVersion );
        else
            result.append( "<unset>" );
        result.append( ", overallLength: " );
        if( overallLengthESet )
            result.append( overallLength );
        else
            result.append( "<unset>" );
        result.append( ", styleNumber: " );
        if( styleNumberESet )
            result.append( styleNumber );
        else
            result.append( "<unset>" );
        result.append( ", usageKind: " );
        if( usageKindESet )
            result.append( usageKind );
        else
            result.append( "<unset>" );
        result.append( ", weightTotal: " );
        if( weightTotalESet )
            result.append( weightTotal );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProductAssetModelImpl
