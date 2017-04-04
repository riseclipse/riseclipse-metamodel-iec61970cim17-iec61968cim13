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
 * A representation of the model object '<em><b>Transformer End Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndNoLoadTests <em>Energised End No Load Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerStarImpedance <em>Transformer Star Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getToMeshImpedances <em>To Mesh Impedances</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getFromMeshImpedances <em>From Mesh Impedances</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo()
 * @model
 * @generated
 */
public interface TransformerEndInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection
     * @see #isSetConnectionKind()
     * @see #unsetConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_ConnectionKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.connectionKind' kind='element'"
     * @generated
     */
    WindingConnection getConnectionKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection
     * @see #isSetConnectionKind()
     * @see #unsetConnectionKind()
     * @see #getConnectionKind()
     * @generated
     */
    void setConnectionKind( WindingConnection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectionKind()
     * @see #getConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @generated
     */
    void unsetConnectionKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connection Kind</em>' attribute is set.
     * @see #unsetConnectionKind()
     * @see #getConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @generated
     */
    boolean isSetConnectionKind();

    /**
     * Returns the value of the '<em><b>Emergency S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emergency S</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emergency S</em>' attribute.
     * @see #isSetEmergencyS()
     * @see #unsetEmergencyS()
     * @see #setEmergencyS(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_EmergencyS()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.emergencyS' kind='element'"
     * @generated
     */
    Float getEmergencyS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emergency S</em>' attribute.
     * @see #isSetEmergencyS()
     * @see #unsetEmergencyS()
     * @see #getEmergencyS()
     * @generated
     */
    void setEmergencyS( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmergencyS()
     * @see #getEmergencyS()
     * @see #setEmergencyS(Float)
     * @generated
     */
    void unsetEmergencyS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emergency S</em>' attribute is set.
     * @see #unsetEmergencyS()
     * @see #getEmergencyS()
     * @see #setEmergencyS(Float)
     * @generated
     */
    boolean isSetEmergencyS();

    /**
     * Returns the value of the '<em><b>End Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #setEndNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_EndNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.endNumber' kind='element'"
     * @generated
     */
    Integer getEndNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @generated
     */
    void setEndNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(Integer)
     * @generated
     */
    void unsetEndNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Number</em>' attribute is set.
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(Integer)
     * @generated
     */
    boolean isSetEndNumber();

    /**
     * Returns the value of the '<em><b>Insulation U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insulation U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insulation U</em>' attribute.
     * @see #isSetInsulationU()
     * @see #unsetInsulationU()
     * @see #setInsulationU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_InsulationU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.insulationU' kind='element'"
     * @generated
     */
    Float getInsulationU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insulation U</em>' attribute.
     * @see #isSetInsulationU()
     * @see #unsetInsulationU()
     * @see #getInsulationU()
     * @generated
     */
    void setInsulationU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInsulationU()
     * @see #getInsulationU()
     * @see #setInsulationU(Float)
     * @generated
     */
    void unsetInsulationU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Insulation U</em>' attribute is set.
     * @see #unsetInsulationU()
     * @see #getInsulationU()
     * @see #setInsulationU(Float)
     * @generated
     */
    boolean isSetInsulationU();

    /**
     * Returns the value of the '<em><b>Phase Angle Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Angle Clock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Angle Clock</em>' attribute.
     * @see #isSetPhaseAngleClock()
     * @see #unsetPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_PhaseAngleClock()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.phaseAngleClock' kind='element'"
     * @generated
     */
    Integer getPhaseAngleClock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Angle Clock</em>' attribute.
     * @see #isSetPhaseAngleClock()
     * @see #unsetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @generated
     */
    void setPhaseAngleClock( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @generated
     */
    void unsetPhaseAngleClock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Angle Clock</em>' attribute is set.
     * @see #unsetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @generated
     */
    boolean isSetPhaseAngleClock();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>Rated S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #setRatedS(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_RatedS()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.ratedS' kind='element'"
     * @generated
     */
    Float getRatedS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @generated
     */
    void setRatedS( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Float)
     * @generated
     */
    void unsetRatedS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated S</em>' attribute is set.
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Float)
     * @generated
     */
    boolean isSetRatedS();

    /**
     * Returns the value of the '<em><b>Rated U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #setRatedU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_RatedU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.ratedU' kind='element'"
     * @generated
     */
    Float getRatedU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @generated
     */
    void setRatedU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Float)
     * @generated
     */
    void unsetRatedU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated U</em>' attribute is set.
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Float)
     * @generated
     */
    boolean isSetRatedU();

    /**
     * Returns the value of the '<em><b>Short Term S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Term S</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Term S</em>' attribute.
     * @see #isSetShortTermS()
     * @see #unsetShortTermS()
     * @see #setShortTermS(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_ShortTermS()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.shortTermS' kind='element'"
     * @generated
     */
    Float getShortTermS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Term S</em>' attribute.
     * @see #isSetShortTermS()
     * @see #unsetShortTermS()
     * @see #getShortTermS()
     * @generated
     */
    void setShortTermS( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortTermS()
     * @see #getShortTermS()
     * @see #setShortTermS(Float)
     * @generated
     */
    void unsetShortTermS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short Term S</em>' attribute is set.
     * @see #unsetShortTermS()
     * @see #getShortTermS()
     * @see #setShortTermS(Float)
     * @generated
     */
    boolean isSetShortTermS();

    /**
     * Returns the value of the '<em><b>Grounded End Short Circuit Tests</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounded End Short Circuit Tests</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounded End Short Circuit Tests</em>' reference list.
     * @see #isSetGroundedEndShortCircuitTests()
     * @see #unsetGroundedEndShortCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_GroundedEndShortCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getGroundedEnds
     * @model opposite="GroundedEnds" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.GroundedEndShortCircuitTests' kind='element'"
     * @generated
     */
    EList< ShortCircuitTest > getGroundedEndShortCircuitTests();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGroundedEndShortCircuitTests()
     * @see #getGroundedEndShortCircuitTests()
     * @generated
     */
    void unsetGroundedEndShortCircuitTests();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded End Short Circuit Tests</em>' reference list is set.
     * @see #unsetGroundedEndShortCircuitTests()
     * @see #getGroundedEndShortCircuitTests()
     * @generated
     */
    boolean isSetGroundedEndShortCircuitTests();

    /**
     * Returns the value of the '<em><b>Energised End No Load Tests</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd <em>Energised End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End No Load Tests</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End No Load Tests</em>' reference list.
     * @see #isSetEnergisedEndNoLoadTests()
     * @see #unsetEnergisedEndNoLoadTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_EnergisedEndNoLoadTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd
     * @model opposite="EnergisedEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.EnergisedEndNoLoadTests' kind='element'"
     * @generated
     */
    EList< NoLoadTest > getEnergisedEndNoLoadTests();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndNoLoadTests <em>Energised End No Load Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndNoLoadTests()
     * @see #getEnergisedEndNoLoadTests()
     * @generated
     */
    void unsetEnergisedEndNoLoadTests();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndNoLoadTests <em>Energised End No Load Tests</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End No Load Tests</em>' reference list is set.
     * @see #unsetEnergisedEndNoLoadTests()
     * @see #getEnergisedEndNoLoadTests()
     * @generated
     */
    boolean isSetEnergisedEndNoLoadTests();

    /**
     * Returns the value of the '<em><b>Transformer Star Impedance</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance#getTransformerEndInfo <em>Transformer End Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Star Impedance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Star Impedance</em>' reference.
     * @see #isSetTransformerStarImpedance()
     * @see #unsetTransformerStarImpedance()
     * @see #setTransformerStarImpedance(TransformerStarImpedance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_TransformerStarImpedance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance#getTransformerEndInfo
     * @model opposite="TransformerEndInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.TransformerStarImpedance' kind='element'"
     * @generated
     */
    TransformerStarImpedance getTransformerStarImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerStarImpedance <em>Transformer Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Star Impedance</em>' reference.
     * @see #isSetTransformerStarImpedance()
     * @see #unsetTransformerStarImpedance()
     * @see #getTransformerStarImpedance()
     * @generated
     */
    void setTransformerStarImpedance( TransformerStarImpedance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerStarImpedance <em>Transformer Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerStarImpedance()
     * @see #getTransformerStarImpedance()
     * @see #setTransformerStarImpedance(TransformerStarImpedance)
     * @generated
     */
    void unsetTransformerStarImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerStarImpedance <em>Transformer Star Impedance</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Star Impedance</em>' reference is set.
     * @see #unsetTransformerStarImpedance()
     * @see #getTransformerStarImpedance()
     * @see #setTransformerStarImpedance(TransformerStarImpedance)
     * @generated
     */
    boolean isSetTransformerStarImpedance();

    /**
     * Returns the value of the '<em><b>Open End Open Circuit Tests</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd <em>Open End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open End Open Circuit Tests</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open End Open Circuit Tests</em>' reference list.
     * @see #isSetOpenEndOpenCircuitTests()
     * @see #unsetOpenEndOpenCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_OpenEndOpenCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd
     * @model opposite="OpenEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.OpenEndOpenCircuitTests' kind='element'"
     * @generated
     */
    EList< OpenCircuitTest > getOpenEndOpenCircuitTests();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpenEndOpenCircuitTests()
     * @see #getOpenEndOpenCircuitTests()
     * @generated
     */
    void unsetOpenEndOpenCircuitTests();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open End Open Circuit Tests</em>' reference list is set.
     * @see #unsetOpenEndOpenCircuitTests()
     * @see #getOpenEndOpenCircuitTests()
     * @generated
     */
    boolean isSetOpenEndOpenCircuitTests();

    /**
     * Returns the value of the '<em><b>To Mesh Impedances</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEndInfos <em>To Transformer End Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Mesh Impedances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Mesh Impedances</em>' reference list.
     * @see #isSetToMeshImpedances()
     * @see #unsetToMeshImpedances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_ToMeshImpedances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEndInfos
     * @model opposite="ToTransformerEndInfos" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.ToMeshImpedances' kind='element'"
     * @generated
     */
    EList< TransformerMeshImpedance > getToMeshImpedances();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getToMeshImpedances <em>To Mesh Impedances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToMeshImpedances()
     * @see #getToMeshImpedances()
     * @generated
     */
    void unsetToMeshImpedances();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getToMeshImpedances <em>To Mesh Impedances</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To Mesh Impedances</em>' reference list is set.
     * @see #unsetToMeshImpedances()
     * @see #getToMeshImpedances()
     * @generated
     */
    boolean isSetToMeshImpedances();

    /**
     * Returns the value of the '<em><b>Energised End Short Circuit Tests</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End Short Circuit Tests</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End Short Circuit Tests</em>' reference list.
     * @see #isSetEnergisedEndShortCircuitTests()
     * @see #unsetEnergisedEndShortCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_EnergisedEndShortCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest#getEnergisedEnd
     * @model opposite="EnergisedEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.EnergisedEndShortCircuitTests' kind='element'"
     * @generated
     */
    EList< ShortCircuitTest > getEnergisedEndShortCircuitTests();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndShortCircuitTests()
     * @see #getEnergisedEndShortCircuitTests()
     * @generated
     */
    void unsetEnergisedEndShortCircuitTests();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End Short Circuit Tests</em>' reference list is set.
     * @see #unsetEnergisedEndShortCircuitTests()
     * @see #getEnergisedEndShortCircuitTests()
     * @generated
     */
    boolean isSetEnergisedEndShortCircuitTests();

    /**
     * Returns the value of the '<em><b>Energised End Open Circuit Tests</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End Open Circuit Tests</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End Open Circuit Tests</em>' reference list.
     * @see #isSetEnergisedEndOpenCircuitTests()
     * @see #unsetEnergisedEndOpenCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_EnergisedEndOpenCircuitTests()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd
     * @model opposite="EnergisedEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.EnergisedEndOpenCircuitTests' kind='element'"
     * @generated
     */
    EList< OpenCircuitTest > getEnergisedEndOpenCircuitTests();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndOpenCircuitTests()
     * @see #getEnergisedEndOpenCircuitTests()
     * @generated
     */
    void unsetEnergisedEndOpenCircuitTests();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End Open Circuit Tests</em>' reference list is set.
     * @see #unsetEnergisedEndOpenCircuitTests()
     * @see #getEnergisedEndOpenCircuitTests()
     * @generated
     */
    boolean isSetEnergisedEndOpenCircuitTests();

    /**
     * Returns the value of the '<em><b>Transformer Tank Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Tank Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Tank Info</em>' reference.
     * @see #isSetTransformerTankInfo()
     * @see #unsetTransformerTankInfo()
     * @see #setTransformerTankInfo(TransformerTankInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_TransformerTankInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getTransformerEndInfos
     * @model opposite="TransformerEndInfos" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.TransformerTankInfo' kind='element'"
     * @generated
     */
    TransformerTankInfo getTransformerTankInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Tank Info</em>' reference.
     * @see #isSetTransformerTankInfo()
     * @see #unsetTransformerTankInfo()
     * @see #getTransformerTankInfo()
     * @generated
     */
    void setTransformerTankInfo( TransformerTankInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerTankInfo()
     * @see #getTransformerTankInfo()
     * @see #setTransformerTankInfo(TransformerTankInfo)
     * @generated
     */
    void unsetTransformerTankInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Tank Info</em>' reference is set.
     * @see #unsetTransformerTankInfo()
     * @see #getTransformerTankInfo()
     * @see #setTransformerTankInfo(TransformerTankInfo)
     * @generated
     */
    boolean isSetTransformerTankInfo();

    /**
     * Returns the value of the '<em><b>Core Admittance</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance#getTransformerEndInfo <em>Transformer End Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Core Admittance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Core Admittance</em>' reference.
     * @see #isSetCoreAdmittance()
     * @see #unsetCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_CoreAdmittance()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance#getTransformerEndInfo
     * @model opposite="TransformerEndInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.CoreAdmittance' kind='element'"
     * @generated
     */
    TransformerCoreAdmittance getCoreAdmittance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Core Admittance</em>' reference.
     * @see #isSetCoreAdmittance()
     * @see #unsetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @generated
     */
    void setCoreAdmittance( TransformerCoreAdmittance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @generated
     */
    void unsetCoreAdmittance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Core Admittance</em>' reference is set.
     * @see #unsetCoreAdmittance()
     * @see #getCoreAdmittance()
     * @see #setCoreAdmittance(TransformerCoreAdmittance)
     * @generated
     */
    boolean isSetCoreAdmittance();

    /**
     * Returns the value of the '<em><b>From Mesh Impedances</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Mesh Impedances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Mesh Impedances</em>' reference list.
     * @see #isSetFromMeshImpedances()
     * @see #unsetFromMeshImpedances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerEndInfo_FromMeshImpedances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo
     * @model opposite="FromTransformerEndInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerEndInfo.FromMeshImpedances' kind='element'"
     * @generated
     */
    EList< TransformerMeshImpedance > getFromMeshImpedances();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getFromMeshImpedances <em>From Mesh Impedances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromMeshImpedances()
     * @see #getFromMeshImpedances()
     * @generated
     */
    void unsetFromMeshImpedances();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getFromMeshImpedances <em>From Mesh Impedances</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From Mesh Impedances</em>' reference list is set.
     * @see #unsetFromMeshImpedances()
     * @see #getFromMeshImpedances()
     * @generated
     */
    boolean isSetFromMeshImpedances();

} // TransformerEndInfo
