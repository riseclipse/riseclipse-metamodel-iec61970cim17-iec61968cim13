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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bushing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getInsulationKind <em>Insulation Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedLineToGroundVoltage <em>Rated Line To Ground Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo()
 * @model
 * @generated
 */
public interface BushingInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>C1 Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C1 Capacitance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C1 Capacitance</em>' attribute.
     * @see #isSetC1Capacitance()
     * @see #unsetC1Capacitance()
     * @see #setC1Capacitance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_C1Capacitance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.c1Capacitance' kind='element'"
     * @generated
     */
    Float getC1Capacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C1 Capacitance</em>' attribute.
     * @see #isSetC1Capacitance()
     * @see #unsetC1Capacitance()
     * @see #getC1Capacitance()
     * @generated
     */
    void setC1Capacitance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetC1Capacitance()
     * @see #getC1Capacitance()
     * @see #setC1Capacitance(Float)
     * @generated
     */
    void unsetC1Capacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>C1 Capacitance</em>' attribute is set.
     * @see #unsetC1Capacitance()
     * @see #getC1Capacitance()
     * @see #setC1Capacitance(Float)
     * @generated
     */
    boolean isSetC1Capacitance();

    /**
     * Returns the value of the '<em><b>C1 Power Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C1 Power Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C1 Power Factor</em>' attribute.
     * @see #isSetC1PowerFactor()
     * @see #unsetC1PowerFactor()
     * @see #setC1PowerFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_C1PowerFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.c1PowerFactor' kind='element'"
     * @generated
     */
    Float getC1PowerFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C1 Power Factor</em>' attribute.
     * @see #isSetC1PowerFactor()
     * @see #unsetC1PowerFactor()
     * @see #getC1PowerFactor()
     * @generated
     */
    void setC1PowerFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetC1PowerFactor()
     * @see #getC1PowerFactor()
     * @see #setC1PowerFactor(Float)
     * @generated
     */
    void unsetC1PowerFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>C1 Power Factor</em>' attribute is set.
     * @see #unsetC1PowerFactor()
     * @see #getC1PowerFactor()
     * @see #setC1PowerFactor(Float)
     * @generated
     */
    boolean isSetC1PowerFactor();

    /**
     * Returns the value of the '<em><b>C2 Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C2 Capacitance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C2 Capacitance</em>' attribute.
     * @see #isSetC2Capacitance()
     * @see #unsetC2Capacitance()
     * @see #setC2Capacitance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_C2Capacitance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.c2Capacitance' kind='element'"
     * @generated
     */
    Float getC2Capacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C2 Capacitance</em>' attribute.
     * @see #isSetC2Capacitance()
     * @see #unsetC2Capacitance()
     * @see #getC2Capacitance()
     * @generated
     */
    void setC2Capacitance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetC2Capacitance()
     * @see #getC2Capacitance()
     * @see #setC2Capacitance(Float)
     * @generated
     */
    void unsetC2Capacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>C2 Capacitance</em>' attribute is set.
     * @see #unsetC2Capacitance()
     * @see #getC2Capacitance()
     * @see #setC2Capacitance(Float)
     * @generated
     */
    boolean isSetC2Capacitance();

    /**
     * Returns the value of the '<em><b>C2 Power Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C2 Power Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C2 Power Factor</em>' attribute.
     * @see #isSetC2PowerFactor()
     * @see #unsetC2PowerFactor()
     * @see #setC2PowerFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_C2PowerFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.c2PowerFactor' kind='element'"
     * @generated
     */
    Float getC2PowerFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C2 Power Factor</em>' attribute.
     * @see #isSetC2PowerFactor()
     * @see #unsetC2PowerFactor()
     * @see #getC2PowerFactor()
     * @generated
     */
    void setC2PowerFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetC2PowerFactor()
     * @see #getC2PowerFactor()
     * @see #setC2PowerFactor(Float)
     * @generated
     */
    void unsetC2PowerFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>C2 Power Factor</em>' attribute is set.
     * @see #unsetC2PowerFactor()
     * @see #getC2PowerFactor()
     * @see #setC2PowerFactor(Float)
     * @generated
     */
    boolean isSetC2PowerFactor();

    /**
     * Returns the value of the '<em><b>Insulation Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInsulationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insulation Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insulation Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInsulationKind
     * @see #isSetInsulationKind()
     * @see #unsetInsulationKind()
     * @see #setInsulationKind(BushingInsulationKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_InsulationKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.insulationKind' kind='element'"
     * @generated
     */
    BushingInsulationKind getInsulationKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getInsulationKind <em>Insulation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insulation Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInsulationKind
     * @see #isSetInsulationKind()
     * @see #unsetInsulationKind()
     * @see #getInsulationKind()
     * @generated
     */
    void setInsulationKind( BushingInsulationKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getInsulationKind <em>Insulation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInsulationKind()
     * @see #getInsulationKind()
     * @see #setInsulationKind(BushingInsulationKind)
     * @generated
     */
    void unsetInsulationKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getInsulationKind <em>Insulation Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Insulation Kind</em>' attribute is set.
     * @see #unsetInsulationKind()
     * @see #getInsulationKind()
     * @see #setInsulationKind(BushingInsulationKind)
     * @generated
     */
    boolean isSetInsulationKind();

    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Rated Impulse Withstand Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Impulse Withstand Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Impulse Withstand Voltage</em>' attribute.
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_RatedImpulseWithstandVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.ratedImpulseWithstandVoltage' kind='element'"
     * @generated
     */
    Float getRatedImpulseWithstandVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Impulse Withstand Voltage</em>' attribute.
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     */
    void setRatedImpulseWithstandVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @generated
     */
    void unsetRatedImpulseWithstandVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Impulse Withstand Voltage</em>' attribute is set.
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @generated
     */
    boolean isSetRatedImpulseWithstandVoltage();

    /**
     * Returns the value of the '<em><b>Rated Line To Ground Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Line To Ground Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Line To Ground Voltage</em>' attribute.
     * @see #isSetRatedLineToGroundVoltage()
     * @see #unsetRatedLineToGroundVoltage()
     * @see #setRatedLineToGroundVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_RatedLineToGroundVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.ratedLineToGroundVoltage' kind='element'"
     * @generated
     */
    Float getRatedLineToGroundVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedLineToGroundVoltage <em>Rated Line To Ground Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Line To Ground Voltage</em>' attribute.
     * @see #isSetRatedLineToGroundVoltage()
     * @see #unsetRatedLineToGroundVoltage()
     * @see #getRatedLineToGroundVoltage()
     * @generated
     */
    void setRatedLineToGroundVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedLineToGroundVoltage <em>Rated Line To Ground Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedLineToGroundVoltage()
     * @see #getRatedLineToGroundVoltage()
     * @see #setRatedLineToGroundVoltage(Float)
     * @generated
     */
    void unsetRatedLineToGroundVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedLineToGroundVoltage <em>Rated Line To Ground Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Line To Ground Voltage</em>' attribute is set.
     * @see #unsetRatedLineToGroundVoltage()
     * @see #getRatedLineToGroundVoltage()
     * @see #setRatedLineToGroundVoltage(Float)
     * @generated
     */
    boolean isSetRatedLineToGroundVoltage();

    /**
     * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInfo_RatedVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BushingInfo.ratedVoltage' kind='element'"
     * @generated
     */
    Float getRatedVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @generated
     */
    void setRatedVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    void unsetRatedVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    boolean isSetRatedVoltage();

} // BushingInfo
