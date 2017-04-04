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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogueNumber <em>Catalogue Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getDrawingNumber <em>Drawing Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getInstructionManual <em>Instruction Manual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOverallLength <em>Overall Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getStyleNumber <em>Style Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType <em>Catalog Asset Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel()
 * @model
 * @generated
 */
public interface ProductAssetModel extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Catalogue Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalogue Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catalogue Number</em>' attribute.
     * @see #isSetCatalogueNumber()
     * @see #unsetCatalogueNumber()
     * @see #setCatalogueNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_CatalogueNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.catalogueNumber' kind='element'"
     * @generated
     */
    String getCatalogueNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogueNumber <em>Catalogue Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Catalogue Number</em>' attribute.
     * @see #isSetCatalogueNumber()
     * @see #unsetCatalogueNumber()
     * @see #getCatalogueNumber()
     * @generated
     */
    void setCatalogueNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogueNumber <em>Catalogue Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCatalogueNumber()
     * @see #getCatalogueNumber()
     * @see #setCatalogueNumber(String)
     * @generated
     */
    void unsetCatalogueNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogueNumber <em>Catalogue Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Catalogue Number</em>' attribute is set.
     * @see #unsetCatalogueNumber()
     * @see #getCatalogueNumber()
     * @see #setCatalogueNumber(String)
     * @generated
     */
    boolean isSetCatalogueNumber();

    /**
     * Returns the value of the '<em><b>Corporate Standard Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CorporateStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Corporate Standard Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Corporate Standard Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CorporateStandardKind
     * @see #isSetCorporateStandardKind()
     * @see #unsetCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_CorporateStandardKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.corporateStandardKind' kind='element'"
     * @generated
     */
    CorporateStandardKind getCorporateStandardKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corporate Standard Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CorporateStandardKind
     * @see #isSetCorporateStandardKind()
     * @see #unsetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @generated
     */
    void setCorporateStandardKind( CorporateStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @generated
     */
    void unsetCorporateStandardKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Corporate Standard Kind</em>' attribute is set.
     * @see #unsetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @generated
     */
    boolean isSetCorporateStandardKind();

    /**
     * Returns the value of the '<em><b>Drawing Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Drawing Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Drawing Number</em>' attribute.
     * @see #isSetDrawingNumber()
     * @see #unsetDrawingNumber()
     * @see #setDrawingNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_DrawingNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.drawingNumber' kind='element'"
     * @generated
     */
    String getDrawingNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getDrawingNumber <em>Drawing Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Drawing Number</em>' attribute.
     * @see #isSetDrawingNumber()
     * @see #unsetDrawingNumber()
     * @see #getDrawingNumber()
     * @generated
     */
    void setDrawingNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getDrawingNumber <em>Drawing Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrawingNumber()
     * @see #getDrawingNumber()
     * @see #setDrawingNumber(String)
     * @generated
     */
    void unsetDrawingNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getDrawingNumber <em>Drawing Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drawing Number</em>' attribute is set.
     * @see #unsetDrawingNumber()
     * @see #getDrawingNumber()
     * @see #setDrawingNumber(String)
     * @generated
     */
    boolean isSetDrawingNumber();

    /**
     * Returns the value of the '<em><b>Instruction Manual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instruction Manual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instruction Manual</em>' attribute.
     * @see #isSetInstructionManual()
     * @see #unsetInstructionManual()
     * @see #setInstructionManual(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_InstructionManual()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.instructionManual' kind='element'"
     * @generated
     */
    String getInstructionManual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getInstructionManual <em>Instruction Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instruction Manual</em>' attribute.
     * @see #isSetInstructionManual()
     * @see #unsetInstructionManual()
     * @see #getInstructionManual()
     * @generated
     */
    void setInstructionManual( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getInstructionManual <em>Instruction Manual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstructionManual()
     * @see #getInstructionManual()
     * @see #setInstructionManual(String)
     * @generated
     */
    void unsetInstructionManual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getInstructionManual <em>Instruction Manual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Instruction Manual</em>' attribute is set.
     * @see #unsetInstructionManual()
     * @see #getInstructionManual()
     * @see #setInstructionManual(String)
     * @generated
     */
    boolean isSetInstructionManual();

    /**
     * Returns the value of the '<em><b>Model Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Number</em>' attribute.
     * @see #isSetModelNumber()
     * @see #unsetModelNumber()
     * @see #setModelNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_ModelNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.modelNumber' kind='element'"
     * @generated
     */
    String getModelNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Number</em>' attribute.
     * @see #isSetModelNumber()
     * @see #unsetModelNumber()
     * @see #getModelNumber()
     * @generated
     */
    void setModelNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelNumber()
     * @see #getModelNumber()
     * @see #setModelNumber(String)
     * @generated
     */
    void unsetModelNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Number</em>' attribute is set.
     * @see #unsetModelNumber()
     * @see #getModelNumber()
     * @see #setModelNumber(String)
     * @generated
     */
    boolean isSetModelNumber();

    /**
     * Returns the value of the '<em><b>Model Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Version</em>' attribute.
     * @see #isSetModelVersion()
     * @see #unsetModelVersion()
     * @see #setModelVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_ModelVersion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.modelVersion' kind='element'"
     * @generated
     */
    String getModelVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Version</em>' attribute.
     * @see #isSetModelVersion()
     * @see #unsetModelVersion()
     * @see #getModelVersion()
     * @generated
     */
    void setModelVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelVersion()
     * @see #getModelVersion()
     * @see #setModelVersion(String)
     * @generated
     */
    void unsetModelVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Version</em>' attribute is set.
     * @see #unsetModelVersion()
     * @see #getModelVersion()
     * @see #setModelVersion(String)
     * @generated
     */
    boolean isSetModelVersion();

    /**
     * Returns the value of the '<em><b>Overall Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Overall Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Overall Length</em>' attribute.
     * @see #isSetOverallLength()
     * @see #unsetOverallLength()
     * @see #setOverallLength(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_OverallLength()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.overallLength' kind='element'"
     * @generated
     */
    Float getOverallLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOverallLength <em>Overall Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Overall Length</em>' attribute.
     * @see #isSetOverallLength()
     * @see #unsetOverallLength()
     * @see #getOverallLength()
     * @generated
     */
    void setOverallLength( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOverallLength <em>Overall Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverallLength()
     * @see #getOverallLength()
     * @see #setOverallLength(Float)
     * @generated
     */
    void unsetOverallLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOverallLength <em>Overall Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Overall Length</em>' attribute is set.
     * @see #unsetOverallLength()
     * @see #getOverallLength()
     * @see #setOverallLength(Float)
     * @generated
     */
    boolean isSetOverallLength();

    /**
     * Returns the value of the '<em><b>Style Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style Number</em>' attribute.
     * @see #isSetStyleNumber()
     * @see #unsetStyleNumber()
     * @see #setStyleNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_StyleNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.styleNumber' kind='element'"
     * @generated
     */
    String getStyleNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getStyleNumber <em>Style Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style Number</em>' attribute.
     * @see #isSetStyleNumber()
     * @see #unsetStyleNumber()
     * @see #getStyleNumber()
     * @generated
     */
    void setStyleNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getStyleNumber <em>Style Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStyleNumber()
     * @see #getStyleNumber()
     * @see #setStyleNumber(String)
     * @generated
     */
    void unsetStyleNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getStyleNumber <em>Style Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Style Number</em>' attribute is set.
     * @see #unsetStyleNumber()
     * @see #getStyleNumber()
     * @see #setStyleNumber(String)
     * @generated
     */
    boolean isSetStyleNumber();

    /**
     * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetModelUsageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetModelUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_UsageKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.usageKind' kind='element'"
     * @generated
     */
    AssetModelUsageKind getUsageKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetModelUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @generated
     */
    void setUsageKind( AssetModelUsageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @generated
     */
    void unsetUsageKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Kind</em>' attribute is set.
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @generated
     */
    boolean isSetUsageKind();

    /**
     * Returns the value of the '<em><b>Weight Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weight Total</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weight Total</em>' attribute.
     * @see #isSetWeightTotal()
     * @see #unsetWeightTotal()
     * @see #setWeightTotal(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_WeightTotal()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.weightTotal' kind='element'"
     * @generated
     */
    Float getWeightTotal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weight Total</em>' attribute.
     * @see #isSetWeightTotal()
     * @see #unsetWeightTotal()
     * @see #getWeightTotal()
     * @generated
     */
    void setWeightTotal( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWeightTotal()
     * @see #getWeightTotal()
     * @see #setWeightTotal(Float)
     * @generated
     */
    void unsetWeightTotal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Weight Total</em>' attribute is set.
     * @see #unsetWeightTotal()
     * @see #getWeightTotal()
     * @see #setWeightTotal(Float)
     * @generated
     */
    boolean isSetWeightTotal();

    /**
     * Returns the value of the '<em><b>Asset Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getProductAssetModel <em>Product Asset Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Info</em>' reference.
     * @see #isSetAssetInfo()
     * @see #unsetAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_AssetInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getProductAssetModel
     * @model opposite="ProductAssetModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.AssetInfo' kind='element'"
     * @generated
     */
    AssetInfo getAssetInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAssetInfo <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Info</em>' reference.
     * @see #isSetAssetInfo()
     * @see #unsetAssetInfo()
     * @see #getAssetInfo()
     * @generated
     */
    void setAssetInfo( AssetInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAssetInfo <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetInfo()
     * @see #getAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @generated
     */
    void unsetAssetInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAssetInfo <em>Asset Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Info</em>' reference is set.
     * @see #unsetAssetInfo()
     * @see #getAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @generated
     */
    boolean isSetAssetInfo();

    /**
     * Returns the value of the '<em><b>Operational Restrictions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Restrictions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Restrictions</em>' reference list.
     * @see #isSetOperationalRestrictions()
     * @see #unsetOperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_OperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel
     * @model opposite="ProductAssetModel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.OperationalRestrictions' kind='element'"
     * @generated
     */
    EList< OperationalRestriction > getOperationalRestrictions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    void unsetOperationalRestrictions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Restrictions</em>' reference list is set.
     * @see #unsetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    boolean isSetOperationalRestrictions();

    /**
     * Returns the value of the '<em><b>Catalog Asset Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getProductAssetModel <em>Product Asset Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog Asset Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catalog Asset Type</em>' reference.
     * @see #isSetCatalogAssetType()
     * @see #unsetCatalogAssetType()
     * @see #setCatalogAssetType(CatalogAssetType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_CatalogAssetType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getProductAssetModel
     * @model opposite="ProductAssetModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.CatalogAssetType' kind='element'"
     * @generated
     */
    CatalogAssetType getCatalogAssetType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType <em>Catalog Asset Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Catalog Asset Type</em>' reference.
     * @see #isSetCatalogAssetType()
     * @see #unsetCatalogAssetType()
     * @see #getCatalogAssetType()
     * @generated
     */
    void setCatalogAssetType( CatalogAssetType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType <em>Catalog Asset Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCatalogAssetType()
     * @see #getCatalogAssetType()
     * @see #setCatalogAssetType(CatalogAssetType)
     * @generated
     */
    void unsetCatalogAssetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType <em>Catalog Asset Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Catalog Asset Type</em>' reference is set.
     * @see #unsetCatalogAssetType()
     * @see #getCatalogAssetType()
     * @see #setCatalogAssetType(CatalogAssetType)
     * @generated
     */
    boolean isSetCatalogAssetType();

    /**
     * Returns the value of the '<em><b>Manufacturer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Manufacturer#getProductAssetModels <em>Product Asset Models</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manufacturer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manufacturer</em>' reference.
     * @see #isSetManufacturer()
     * @see #unsetManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_Manufacturer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Manufacturer#getProductAssetModels
     * @model opposite="ProductAssetModels" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.Manufacturer' kind='element'"
     * @generated
     */
    Manufacturer getManufacturer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manufacturer</em>' reference.
     * @see #isSetManufacturer()
     * @see #unsetManufacturer()
     * @see #getManufacturer()
     * @generated
     */
    void setManufacturer( Manufacturer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetManufacturer()
     * @see #getManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @generated
     */
    void unsetManufacturer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Manufacturer</em>' reference is set.
     * @see #unsetManufacturer()
     * @see #getManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @generated
     */
    boolean isSetManufacturer();

    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel <em>Product Asset Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference list.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProductAssetModel_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel
     * @model opposite="ProductAssetModel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProductAssetModel.Asset' kind='element'"
     * @generated
     */
    EList< Asset > getAsset();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAsset <em>Asset</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAsset <em>Asset</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference list is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    boolean isSetAsset();

} // ProductAssetModel
