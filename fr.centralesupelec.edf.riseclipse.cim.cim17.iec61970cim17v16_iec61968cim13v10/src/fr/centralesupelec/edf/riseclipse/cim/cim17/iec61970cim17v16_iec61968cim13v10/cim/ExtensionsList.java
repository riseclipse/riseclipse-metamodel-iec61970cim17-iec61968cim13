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
 * A representation of the model object '<em><b>Extensions List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionsList#getExtensionsItem <em>Extensions Item</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionsList()
 * @model
 * @generated
 */
public interface ExtensionsList extends EObject {
    /**
     * Returns the value of the '<em><b>Extensions Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extensions Item</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extensions Item</em>' containment reference.
     * @see #isSetExtensionsItem()
     * @see #unsetExtensionsItem()
     * @see #setExtensionsItem(ExtensionItem)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExtensionsList_ExtensionsItem()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExtensionsList.extensionsItem' kind='element'"
     * @generated
     */
    ExtensionItem getExtensionsItem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionsList#getExtensionsItem <em>Extensions Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extensions Item</em>' containment reference.
     * @see #isSetExtensionsItem()
     * @see #unsetExtensionsItem()
     * @see #getExtensionsItem()
     * @generated
     */
    void setExtensionsItem( ExtensionItem value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionsList#getExtensionsItem <em>Extensions Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtensionsItem()
     * @see #getExtensionsItem()
     * @see #setExtensionsItem(ExtensionItem)
     * @generated
     */
    void unsetExtensionsItem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionsList#getExtensionsItem <em>Extensions Item</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Extensions Item</em>' containment reference is set.
     * @see #unsetExtensionsItem()
     * @see #getExtensionsItem()
     * @see #setExtensionsItem(ExtensionItem)
     * @generated
     */
    boolean isSetExtensionsItem();

} // ExtensionsList
