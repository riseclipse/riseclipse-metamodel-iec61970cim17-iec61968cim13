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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtName <em>Ext Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtType <em>Ext Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtValue <em>Ext Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionItem()
 * @model
 * @generated
 */
public interface ExtensionItem extends EObject {
    /**
     * Returns the value of the '<em><b>Ext Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext Name</em>' attribute.
     * @see #isSetExtName()
     * @see #unsetExtName()
     * @see #setExtName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionItem_ExtName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExtensionItem.extName' kind='element'"
     * @generated
     */
    String getExtName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtName <em>Ext Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Name</em>' attribute.
     * @see #isSetExtName()
     * @see #unsetExtName()
     * @see #getExtName()
     * @generated
     */
    void setExtName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtName <em>Ext Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtName()
     * @see #getExtName()
     * @see #setExtName(String)
     * @generated
     */
    void unsetExtName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtName <em>Ext Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ext Name</em>' attribute is set.
     * @see #unsetExtName()
     * @see #getExtName()
     * @see #setExtName(String)
     * @generated
     */
    boolean isSetExtName();

    /**
     * Returns the value of the '<em><b>Ext Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext Type</em>' attribute.
     * @see #isSetExtType()
     * @see #unsetExtType()
     * @see #setExtType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionItem_ExtType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExtensionItem.extType' kind='element'"
     * @generated
     */
    String getExtType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtType <em>Ext Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Type</em>' attribute.
     * @see #isSetExtType()
     * @see #unsetExtType()
     * @see #getExtType()
     * @generated
     */
    void setExtType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtType <em>Ext Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtType()
     * @see #getExtType()
     * @see #setExtType(String)
     * @generated
     */
    void unsetExtType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtType <em>Ext Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ext Type</em>' attribute is set.
     * @see #unsetExtType()
     * @see #getExtType()
     * @see #setExtType(String)
     * @generated
     */
    boolean isSetExtType();

    /**
     * Returns the value of the '<em><b>Ext Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext Value</em>' attribute.
     * @see #isSetExtValue()
     * @see #unsetExtValue()
     * @see #setExtValue(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionItem_ExtValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExtensionItem.extValue' kind='element'"
     * @generated
     */
    String getExtValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtValue <em>Ext Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Value</em>' attribute.
     * @see #isSetExtValue()
     * @see #unsetExtValue()
     * @see #getExtValue()
     * @generated
     */
    void setExtValue( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtValue <em>Ext Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtValue()
     * @see #getExtValue()
     * @see #setExtValue(String)
     * @generated
     */
    void unsetExtValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem#getExtValue <em>Ext Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ext Value</em>' attribute is set.
     * @see #unsetExtValue()
     * @see #getExtValue()
     * @see #setExtValue(String)
     * @generated
     */
    boolean isSetExtValue();

} // ExtensionItem
