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
 * A representation of the model object '<em><b>Operational Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getActivePeriod <em>Active Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getRestrictedValue <em>Restricted Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalRestriction()
 * @model
 * @generated
 */
public interface OperationalRestriction extends Document {
    /**
     * Returns the value of the '<em><b>Active Period</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active Period</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active Period</em>' containment reference.
     * @see #isSetActivePeriod()
     * @see #unsetActivePeriod()
     * @see #setActivePeriod(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalRestriction_ActivePeriod()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalRestriction.activePeriod' kind='element'"
     * @generated
     */
    DateTimeInterval getActivePeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getActivePeriod <em>Active Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active Period</em>' containment reference.
     * @see #isSetActivePeriod()
     * @see #unsetActivePeriod()
     * @see #getActivePeriod()
     * @generated
     */
    void setActivePeriod( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getActivePeriod <em>Active Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActivePeriod()
     * @see #getActivePeriod()
     * @see #setActivePeriod(DateTimeInterval)
     * @generated
     */
    void unsetActivePeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getActivePeriod <em>Active Period</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Active Period</em>' containment reference is set.
     * @see #unsetActivePeriod()
     * @see #getActivePeriod()
     * @see #setActivePeriod(DateTimeInterval)
     * @generated
     */
    boolean isSetActivePeriod();

    /**
     * Returns the value of the '<em><b>Restricted Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restricted Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restricted Value</em>' containment reference.
     * @see #isSetRestrictedValue()
     * @see #unsetRestrictedValue()
     * @see #setRestrictedValue(FloatQuantity)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalRestriction_RestrictedValue()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalRestriction.restrictedValue' kind='element'"
     * @generated
     */
    FloatQuantity getRestrictedValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getRestrictedValue <em>Restricted Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Restricted Value</em>' containment reference.
     * @see #isSetRestrictedValue()
     * @see #unsetRestrictedValue()
     * @see #getRestrictedValue()
     * @generated
     */
    void setRestrictedValue( FloatQuantity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getRestrictedValue <em>Restricted Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRestrictedValue()
     * @see #getRestrictedValue()
     * @see #setRestrictedValue(FloatQuantity)
     * @generated
     */
    void unsetRestrictedValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getRestrictedValue <em>Restricted Value</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Restricted Value</em>' containment reference is set.
     * @see #unsetRestrictedValue()
     * @see #getRestrictedValue()
     * @see #setRestrictedValue(FloatQuantity)
     * @generated
     */
    boolean isSetRestrictedValue();

    /**
     * Returns the value of the '<em><b>Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalRestrictions <em>Operational Restrictions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equipments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipments</em>' reference list.
     * @see #isSetEquipments()
     * @see #unsetEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalRestriction_Equipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalRestrictions
     * @model opposite="OperationalRestrictions" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalRestriction.Equipments' kind='element'"
     * @generated
     */
    EList< Equipment > getEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getEquipments <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipments()
     * @see #getEquipments()
     * @generated
     */
    void unsetEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getEquipments <em>Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipments</em>' reference list is set.
     * @see #unsetEquipments()
     * @see #getEquipments()
     * @generated
     */
    boolean isSetEquipments();

    /**
     * Returns the value of the '<em><b>Product Asset Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Asset Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Product Asset Model</em>' reference.
     * @see #isSetProductAssetModel()
     * @see #unsetProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalRestriction_ProductAssetModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getOperationalRestrictions
     * @model opposite="OperationalRestrictions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalRestriction.ProductAssetModel' kind='element'"
     * @generated
     */
    ProductAssetModel getProductAssetModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Product Asset Model</em>' reference.
     * @see #isSetProductAssetModel()
     * @see #unsetProductAssetModel()
     * @see #getProductAssetModel()
     * @generated
     */
    void setProductAssetModel( ProductAssetModel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProductAssetModel()
     * @see #getProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @generated
     */
    void unsetProductAssetModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Product Asset Model</em>' reference is set.
     * @see #unsetProductAssetModel()
     * @see #getProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @generated
     */
    boolean isSetProductAssetModel();

} // OperationalRestriction
