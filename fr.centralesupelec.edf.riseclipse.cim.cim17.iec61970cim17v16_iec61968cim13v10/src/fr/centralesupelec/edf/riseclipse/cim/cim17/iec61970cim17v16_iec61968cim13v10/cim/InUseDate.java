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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Use Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getInUseDate <em>In Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getNotReadyForUseDate <em>Not Ready For Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getReadyForUseDate <em>Ready For Use Date</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInUseDate()
 * @model
 * @generated
 */
public interface InUseDate extends EObject {
    /**
     * Returns the value of the '<em><b>In Use Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Use Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Use Date</em>' attribute.
     * @see #isSetInUseDate()
     * @see #unsetInUseDate()
     * @see #setInUseDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInUseDate_InUseDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InUseDate.inUseDate' kind='element'"
     * @generated
     */
    Date getInUseDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getInUseDate <em>In Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Use Date</em>' attribute.
     * @see #isSetInUseDate()
     * @see #unsetInUseDate()
     * @see #getInUseDate()
     * @generated
     */
    void setInUseDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getInUseDate <em>In Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInUseDate()
     * @see #getInUseDate()
     * @see #setInUseDate(Date)
     * @generated
     */
    void unsetInUseDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getInUseDate <em>In Use Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Use Date</em>' attribute is set.
     * @see #unsetInUseDate()
     * @see #getInUseDate()
     * @see #setInUseDate(Date)
     * @generated
     */
    boolean isSetInUseDate();

    /**
     * Returns the value of the '<em><b>Not Ready For Use Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Ready For Use Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not Ready For Use Date</em>' attribute.
     * @see #isSetNotReadyForUseDate()
     * @see #unsetNotReadyForUseDate()
     * @see #setNotReadyForUseDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInUseDate_NotReadyForUseDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InUseDate.notReadyForUseDate' kind='element'"
     * @generated
     */
    Date getNotReadyForUseDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getNotReadyForUseDate <em>Not Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not Ready For Use Date</em>' attribute.
     * @see #isSetNotReadyForUseDate()
     * @see #unsetNotReadyForUseDate()
     * @see #getNotReadyForUseDate()
     * @generated
     */
    void setNotReadyForUseDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getNotReadyForUseDate <em>Not Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNotReadyForUseDate()
     * @see #getNotReadyForUseDate()
     * @see #setNotReadyForUseDate(Date)
     * @generated
     */
    void unsetNotReadyForUseDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getNotReadyForUseDate <em>Not Ready For Use Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Not Ready For Use Date</em>' attribute is set.
     * @see #unsetNotReadyForUseDate()
     * @see #getNotReadyForUseDate()
     * @see #setNotReadyForUseDate(Date)
     * @generated
     */
    boolean isSetNotReadyForUseDate();

    /**
     * Returns the value of the '<em><b>Ready For Use Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ready For Use Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ready For Use Date</em>' attribute.
     * @see #isSetReadyForUseDate()
     * @see #unsetReadyForUseDate()
     * @see #setReadyForUseDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInUseDate_ReadyForUseDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InUseDate.readyForUseDate' kind='element'"
     * @generated
     */
    Date getReadyForUseDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getReadyForUseDate <em>Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ready For Use Date</em>' attribute.
     * @see #isSetReadyForUseDate()
     * @see #unsetReadyForUseDate()
     * @see #getReadyForUseDate()
     * @generated
     */
    void setReadyForUseDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getReadyForUseDate <em>Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadyForUseDate()
     * @see #getReadyForUseDate()
     * @see #setReadyForUseDate(Date)
     * @generated
     */
    void unsetReadyForUseDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate#getReadyForUseDate <em>Ready For Use Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ready For Use Date</em>' attribute is set.
     * @see #unsetReadyForUseDate()
     * @see #getReadyForUseDate()
     * @see #setReadyForUseDate(Date)
     * @generated
     */
    boolean isSetReadyForUseDate();

} // InUseDate
