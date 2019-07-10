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
 * A representation of the model object '<em><b>IO Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getIOPointSource <em>IO Point Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getBilateralToIOPoint <em>Bilateral To IO Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIOPoint()
 * @model
 * @generated
 */
public interface IOPoint extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>IO Point Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPointSource#getIOPoint <em>IO Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IO Point Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IO Point Source</em>' reference.
     * @see #isSetIOPointSource()
     * @see #unsetIOPointSource()
     * @see #setIOPointSource(IOPointSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIOPoint_IOPointSource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPointSource#getIOPoint
     * @model opposite="IOPoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IOPoint.IOPointSource' kind='element'"
     * @generated
     */
    IOPointSource getIOPointSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getIOPointSource <em>IO Point Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IO Point Source</em>' reference.
     * @see #isSetIOPointSource()
     * @see #unsetIOPointSource()
     * @see #getIOPointSource()
     * @generated
     */
    void setIOPointSource( IOPointSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getIOPointSource <em>IO Point Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIOPointSource()
     * @see #getIOPointSource()
     * @see #setIOPointSource(IOPointSource)
     * @generated
     */
    void unsetIOPointSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getIOPointSource <em>IO Point Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>IO Point Source</em>' reference is set.
     * @see #unsetIOPointSource()
     * @see #getIOPointSource()
     * @see #setIOPointSource(IOPointSource)
     * @generated
     */
    boolean isSetIOPointSource();

    /**
     * Returns the value of the '<em><b>Bilateral To IO Point</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint <em>IO Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bilateral To IO Point</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilateral To IO Point</em>' reference list.
     * @see #isSetBilateralToIOPoint()
     * @see #unsetBilateralToIOPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIOPoint_BilateralToIOPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint
     * @model opposite="IOPoint" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IOPoint.BilateralToIOPoint' kind='element'"
     * @generated
     */
    EList< ProvidedBilateralPoint > getBilateralToIOPoint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getBilateralToIOPoint <em>Bilateral To IO Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBilateralToIOPoint()
     * @see #getBilateralToIOPoint()
     * @generated
     */
    void unsetBilateralToIOPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getBilateralToIOPoint <em>Bilateral To IO Point</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bilateral To IO Point</em>' reference list is set.
     * @see #unsetBilateralToIOPoint()
     * @see #getBilateralToIOPoint()
     * @generated
     */
    boolean isSetBilateralToIOPoint();

} // IOPoint
