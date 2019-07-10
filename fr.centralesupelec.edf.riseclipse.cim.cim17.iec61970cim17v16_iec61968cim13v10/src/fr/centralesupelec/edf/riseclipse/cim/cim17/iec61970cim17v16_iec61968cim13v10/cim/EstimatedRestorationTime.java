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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estimated Restoration Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getConfidenceKind <em>Confidence Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErt <em>Ert</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErtSource <em>Ert Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEstimatedRestorationTime()
 * @model
 * @generated
 */
public interface EstimatedRestorationTime extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Confidence Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ERTConfidenceKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confidence Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Confidence Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ERTConfidenceKind
     * @see #isSetConfidenceKind()
     * @see #unsetConfidenceKind()
     * @see #setConfidenceKind(ERTConfidenceKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEstimatedRestorationTime_ConfidenceKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EstimatedRestorationTime.confidenceKind' kind='element'"
     * @generated
     */
    ERTConfidenceKind getConfidenceKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getConfidenceKind <em>Confidence Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confidence Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ERTConfidenceKind
     * @see #isSetConfidenceKind()
     * @see #unsetConfidenceKind()
     * @see #getConfidenceKind()
     * @generated
     */
    void setConfidenceKind( ERTConfidenceKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getConfidenceKind <em>Confidence Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfidenceKind()
     * @see #getConfidenceKind()
     * @see #setConfidenceKind(ERTConfidenceKind)
     * @generated
     */
    void unsetConfidenceKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getConfidenceKind <em>Confidence Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Confidence Kind</em>' attribute is set.
     * @see #unsetConfidenceKind()
     * @see #getConfidenceKind()
     * @see #setConfidenceKind(ERTConfidenceKind)
     * @generated
     */
    boolean isSetConfidenceKind();

    /**
     * Returns the value of the '<em><b>Ert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ert</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ert</em>' attribute.
     * @see #isSetErt()
     * @see #unsetErt()
     * @see #setErt(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEstimatedRestorationTime_Ert()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EstimatedRestorationTime.ert' kind='element'"
     * @generated
     */
    Date getErt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErt <em>Ert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ert</em>' attribute.
     * @see #isSetErt()
     * @see #unsetErt()
     * @see #getErt()
     * @generated
     */
    void setErt( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErt <em>Ert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetErt()
     * @see #getErt()
     * @see #setErt(Date)
     * @generated
     */
    void unsetErt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErt <em>Ert</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ert</em>' attribute is set.
     * @see #unsetErt()
     * @see #getErt()
     * @see #setErt(Date)
     * @generated
     */
    boolean isSetErt();

    /**
     * Returns the value of the '<em><b>Ert Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ert Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ert Source</em>' attribute.
     * @see #isSetErtSource()
     * @see #unsetErtSource()
     * @see #setErtSource(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEstimatedRestorationTime_ErtSource()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EstimatedRestorationTime.ertSource' kind='element'"
     * @generated
     */
    String getErtSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErtSource <em>Ert Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ert Source</em>' attribute.
     * @see #isSetErtSource()
     * @see #unsetErtSource()
     * @see #getErtSource()
     * @generated
     */
    void setErtSource( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErtSource <em>Ert Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetErtSource()
     * @see #getErtSource()
     * @see #setErtSource(String)
     * @generated
     */
    void unsetErtSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getErtSource <em>Ert Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ert Source</em>' attribute is set.
     * @see #unsetErtSource()
     * @see #getErtSource()
     * @see #setErtSource(String)
     * @generated
     */
    boolean isSetErtSource();

    /**
     * Returns the value of the '<em><b>Outage</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getEstimatedRestorationTime <em>Estimated Restoration Time</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage</em>' reference list.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEstimatedRestorationTime_Outage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getEstimatedRestorationTime
     * @model opposite="EstimatedRestorationTime" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EstimatedRestorationTime.Outage' kind='element'"
     * @generated
     */
    EList< Outage > getOutage();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getOutage <em>Outage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutage()
     * @see #getOutage()
     * @generated
     */
    void unsetOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime#getOutage <em>Outage</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage</em>' reference list is set.
     * @see #unsetOutage()
     * @see #getOutage()
     * @generated
     */
    boolean isSetOutage();

} // EstimatedRestorationTime
