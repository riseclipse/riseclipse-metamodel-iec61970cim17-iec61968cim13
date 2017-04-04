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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Asset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getEstimatedUnitCost <em>Estimated Unit Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getStockItem <em>Stock Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getProductAssetModel <em>Product Asset Model</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType()
 * @model
 * @generated
 */
public interface CatalogAssetType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Estimated Unit Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Estimated Unit Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Estimated Unit Cost</em>' attribute.
     * @see #isSetEstimatedUnitCost()
     * @see #unsetEstimatedUnitCost()
     * @see #setEstimatedUnitCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_EstimatedUnitCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.estimatedUnitCost' kind='element'"
     * @generated
     */
    BigDecimal getEstimatedUnitCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Estimated Unit Cost</em>' attribute.
     * @see #isSetEstimatedUnitCost()
     * @see #unsetEstimatedUnitCost()
     * @see #getEstimatedUnitCost()
     * @generated
     */
    void setEstimatedUnitCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEstimatedUnitCost()
     * @see #getEstimatedUnitCost()
     * @see #setEstimatedUnitCost(BigDecimal)
     * @generated
     */
    void unsetEstimatedUnitCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Estimated Unit Cost</em>' attribute is set.
     * @see #unsetEstimatedUnitCost()
     * @see #getEstimatedUnitCost()
     * @see #setEstimatedUnitCost(BigDecimal)
     * @generated
     */
    boolean isSetEstimatedUnitCost();

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(AssetKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.kind' kind='element'"
     * @generated
     */
    AssetKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( AssetKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(AssetKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(AssetKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Stock Item</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stock Item</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stock Item</em>' attribute.
     * @see #isSetStockItem()
     * @see #unsetStockItem()
     * @see #setStockItem(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_StockItem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.stockItem' kind='element'"
     * @generated
     */
    Boolean getStockItem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getStockItem <em>Stock Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stock Item</em>' attribute.
     * @see #isSetStockItem()
     * @see #unsetStockItem()
     * @see #getStockItem()
     * @generated
     */
    void setStockItem( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getStockItem <em>Stock Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStockItem()
     * @see #getStockItem()
     * @see #setStockItem(Boolean)
     * @generated
     */
    void unsetStockItem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getStockItem <em>Stock Item</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stock Item</em>' attribute is set.
     * @see #unsetStockItem()
     * @see #getStockItem()
     * @see #setStockItem(Boolean)
     * @generated
     */
    boolean isSetStockItem();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.type' kind='element'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quantity</em>' containment reference.
     * @see #isSetQuantity()
     * @see #unsetQuantity()
     * @see #setQuantity(StringQuantity)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_Quantity()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.quantity' kind='element'"
     * @generated
     */
    StringQuantity getQuantity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getQuantity <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quantity</em>' containment reference.
     * @see #isSetQuantity()
     * @see #unsetQuantity()
     * @see #getQuantity()
     * @generated
     */
    void setQuantity( StringQuantity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getQuantity <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQuantity()
     * @see #getQuantity()
     * @see #setQuantity(StringQuantity)
     * @generated
     */
    void unsetQuantity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getQuantity <em>Quantity</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Quantity</em>' containment reference is set.
     * @see #unsetQuantity()
     * @see #getQuantity()
     * @see #setQuantity(StringQuantity)
     * @generated
     */
    boolean isSetQuantity();

    /**
     * Returns the value of the '<em><b>Asset Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getCatalogAssetType <em>Catalog Asset Type</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_AssetInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getCatalogAssetType
     * @model opposite="CatalogAssetType" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.AssetInfo' kind='element'"
     * @generated
     */
    AssetInfo getAssetInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getAssetInfo <em>Asset Info</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getAssetInfo <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetInfo()
     * @see #getAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @generated
     */
    void unsetAssetInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getAssetInfo <em>Asset Info</em>}' reference is set.
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
     * Returns the value of the '<em><b>Product Asset Model</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType <em>Catalog Asset Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Asset Model</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Product Asset Model</em>' reference list.
     * @see #isSetProductAssetModel()
     * @see #unsetProductAssetModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCatalogAssetType_ProductAssetModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getCatalogAssetType
     * @model opposite="CatalogAssetType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CatalogAssetType.ProductAssetModel' kind='element'"
     * @generated
     */
    EList< ProductAssetModel > getProductAssetModel();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getProductAssetModel <em>Product Asset Model</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProductAssetModel()
     * @see #getProductAssetModel()
     * @generated
     */
    void unsetProductAssetModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CatalogAssetType#getProductAssetModel <em>Product Asset Model</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Product Asset Model</em>' reference list is set.
     * @see #unsetProductAssetModel()
     * @see #getProductAssetModel()
     * @generated
     */
    boolean isSetProductAssetModel();

} // CatalogAssetType
