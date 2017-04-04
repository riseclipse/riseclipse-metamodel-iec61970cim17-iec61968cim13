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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket <em>Trouble Ticket</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIncidentHazard()
 * @model
 * @generated
 */
public interface IncidentHazard extends Hazard {
    /**
     * Returns the value of the '<em><b>Incident</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getHazards <em>Hazards</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incident</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #setIncident(Incident)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIncidentHazard_Incident()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getHazards
     * @model opposite="Hazards" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IncidentHazard.Incident' kind='element'"
     * @generated
     */
    Incident getIncident();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #getIncident()
     * @generated
     */
    void setIncident( Incident value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    void unsetIncident();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getIncident <em>Incident</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incident</em>' reference is set.
     * @see #unsetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    boolean isSetIncident();

    /**
     * Returns the value of the '<em><b>Trouble Ticket</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getHazards <em>Hazards</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trouble Ticket</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trouble Ticket</em>' reference.
     * @see #isSetTroubleTicket()
     * @see #unsetTroubleTicket()
     * @see #setTroubleTicket(TroubleTicket)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIncidentHazard_TroubleTicket()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getHazards
     * @model opposite="Hazards" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IncidentHazard.TroubleTicket' kind='element'"
     * @generated
     */
    TroubleTicket getTroubleTicket();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket <em>Trouble Ticket</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trouble Ticket</em>' reference.
     * @see #isSetTroubleTicket()
     * @see #unsetTroubleTicket()
     * @see #getTroubleTicket()
     * @generated
     */
    void setTroubleTicket( TroubleTicket value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket <em>Trouble Ticket</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTroubleTicket()
     * @see #getTroubleTicket()
     * @see #setTroubleTicket(TroubleTicket)
     * @generated
     */
    void unsetTroubleTicket();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket <em>Trouble Ticket</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trouble Ticket</em>' reference is set.
     * @see #unsetTroubleTicket()
     * @see #getTroubleTicket()
     * @see #setTroubleTicket(TroubleTicket)
     * @generated
     */
    boolean isSetTroubleTicket();

} // IncidentHazard
