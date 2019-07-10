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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadGroups <em>Load Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSubLoadArea()
 * @model
 * @generated
 */
public interface SubLoadArea extends EnergyArea {
    /**
     * Returns the value of the '<em><b>Load Groups</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Groups</em>' reference list.
     * @see #isSetLoadGroups()
     * @see #unsetLoadGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSubLoadArea_LoadGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea
     * @model opposite="SubLoadArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SubLoadArea.LoadGroups' kind='element'"
     * @generated
     */
    EList< LoadGroup > getLoadGroups();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadGroups <em>Load Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadGroups()
     * @see #getLoadGroups()
     * @generated
     */
    void unsetLoadGroups();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadGroups <em>Load Groups</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Groups</em>' reference list is set.
     * @see #unsetLoadGroups()
     * @see #getLoadGroups()
     * @generated
     */
    boolean isSetLoadGroups();

    /**
     * Returns the value of the '<em><b>Load Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Area</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Area</em>' reference.
     * @see #isSetLoadArea()
     * @see #unsetLoadArea()
     * @see #setLoadArea(LoadArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSubLoadArea_LoadArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadArea#getSubLoadAreas
     * @model opposite="SubLoadAreas" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SubLoadArea.LoadArea' kind='element'"
     * @generated
     */
    LoadArea getLoadArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Area</em>' reference.
     * @see #isSetLoadArea()
     * @see #unsetLoadArea()
     * @see #getLoadArea()
     * @generated
     */
    void setLoadArea( LoadArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadArea()
     * @see #getLoadArea()
     * @see #setLoadArea(LoadArea)
     * @generated
     */
    void unsetLoadArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadArea <em>Load Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Area</em>' reference is set.
     * @see #unsetLoadArea()
     * @see #getLoadArea()
     * @see #setLoadArea(LoadArea)
     * @generated
     */
    boolean isSetLoadArea();

} // SubLoadArea
