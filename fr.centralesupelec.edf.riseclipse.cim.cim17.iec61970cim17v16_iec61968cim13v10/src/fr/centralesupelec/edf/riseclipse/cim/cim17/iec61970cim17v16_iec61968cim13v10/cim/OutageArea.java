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
 * A representation of the model object '<em><b>Outage Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getEarliestReportedTime <em>Earliest Reported Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getMetersServed <em>Meters Served</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutageAreaKind <em>Outage Area Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOutageArea()
 * @model
 * @generated
 */
public interface OutageArea extends Outage {
    /**
     * Returns the value of the '<em><b>Earliest Reported Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Earliest Reported Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Earliest Reported Time</em>' attribute.
     * @see #isSetEarliestReportedTime()
     * @see #unsetEarliestReportedTime()
     * @see #setEarliestReportedTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOutageArea_EarliestReportedTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OutageArea.earliestReportedTime' kind='element'"
     * @generated
     */
    Date getEarliestReportedTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getEarliestReportedTime <em>Earliest Reported Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earliest Reported Time</em>' attribute.
     * @see #isSetEarliestReportedTime()
     * @see #unsetEarliestReportedTime()
     * @see #getEarliestReportedTime()
     * @generated
     */
    void setEarliestReportedTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getEarliestReportedTime <em>Earliest Reported Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarliestReportedTime()
     * @see #getEarliestReportedTime()
     * @see #setEarliestReportedTime(Date)
     * @generated
     */
    void unsetEarliestReportedTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getEarliestReportedTime <em>Earliest Reported Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earliest Reported Time</em>' attribute is set.
     * @see #unsetEarliestReportedTime()
     * @see #getEarliestReportedTime()
     * @see #setEarliestReportedTime(Date)
     * @generated
     */
    boolean isSetEarliestReportedTime();

    /**
     * Returns the value of the '<em><b>Meters Served</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meters Served</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meters Served</em>' attribute.
     * @see #isSetMetersServed()
     * @see #unsetMetersServed()
     * @see #setMetersServed(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOutageArea_MetersServed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OutageArea.metersServed' kind='element'"
     * @generated
     */
    Integer getMetersServed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getMetersServed <em>Meters Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meters Served</em>' attribute.
     * @see #isSetMetersServed()
     * @see #unsetMetersServed()
     * @see #getMetersServed()
     * @generated
     */
    void setMetersServed( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getMetersServed <em>Meters Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMetersServed()
     * @see #getMetersServed()
     * @see #setMetersServed(Integer)
     * @generated
     */
    void unsetMetersServed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getMetersServed <em>Meters Served</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meters Served</em>' attribute is set.
     * @see #unsetMetersServed()
     * @see #getMetersServed()
     * @see #setMetersServed(Integer)
     * @generated
     */
    boolean isSetMetersServed();

    /**
     * Returns the value of the '<em><b>Outage Area Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AreaKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage Area Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage Area Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AreaKind
     * @see #isSetOutageAreaKind()
     * @see #unsetOutageAreaKind()
     * @see #setOutageAreaKind(AreaKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOutageArea_OutageAreaKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OutageArea.outageAreaKind' kind='element'"
     * @generated
     */
    AreaKind getOutageAreaKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutageAreaKind <em>Outage Area Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage Area Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AreaKind
     * @see #isSetOutageAreaKind()
     * @see #unsetOutageAreaKind()
     * @see #getOutageAreaKind()
     * @generated
     */
    void setOutageAreaKind( AreaKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutageAreaKind <em>Outage Area Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutageAreaKind()
     * @see #getOutageAreaKind()
     * @see #setOutageAreaKind(AreaKind)
     * @generated
     */
    void unsetOutageAreaKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutageAreaKind <em>Outage Area Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage Area Kind</em>' attribute is set.
     * @see #unsetOutageAreaKind()
     * @see #getOutageAreaKind()
     * @see #setOutageAreaKind(AreaKind)
     * @generated
     */
    boolean isSetOutageAreaKind();

    /**
     * Returns the value of the '<em><b>Outage</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getOutageArea <em>Outage Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage</em>' reference list.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOutageArea_Outage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getOutageArea
     * @model opposite="OutageArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OutageArea.Outage' kind='element'"
     * @generated
     */
    EList< Outage > getOutage();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutage <em>Outage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutage()
     * @see #getOutage()
     * @generated
     */
    void unsetOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea#getOutage <em>Outage</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage</em>' reference list is set.
     * @see #unsetOutage()
     * @see #getOutage()
     * @generated
     */
    boolean isSetOutage();

} // OutageArea
