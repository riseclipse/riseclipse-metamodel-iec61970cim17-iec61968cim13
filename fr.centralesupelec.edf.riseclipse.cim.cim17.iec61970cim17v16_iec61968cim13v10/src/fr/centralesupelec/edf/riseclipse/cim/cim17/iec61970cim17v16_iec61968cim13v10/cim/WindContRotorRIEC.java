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
 * A representation of the model object '<em><b>Wind Cont Rotor RIEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC()
 * @model
 * @generated
 */
public interface WindContRotorRIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kirr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kirr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #setKirr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Kirr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.kirr' kind='element'"
     * @generated
     */
    Float getKirr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #getKirr()
     * @generated
     */
    void setKirr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKirr()
     * @see #getKirr()
     * @see #setKirr(Float)
     * @generated
     */
    void unsetKirr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kirr</em>' attribute is set.
     * @see #unsetKirr()
     * @see #getKirr()
     * @see #setKirr(Float)
     * @generated
     */
    boolean isSetKirr();

    /**
     * Returns the value of the '<em><b>Komegafilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Komegafilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #setKomegafilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Komegafilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.komegafilt' kind='element'"
     * @generated
     */
    Float getKomegafilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @generated
     */
    void setKomegafilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Float)
     * @generated
     */
    void unsetKomegafilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Komegafilt</em>' attribute is set.
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Float)
     * @generated
     */
    boolean isSetKomegafilt();

    /**
     * Returns the value of the '<em><b>Kpfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpfilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #setKpfilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Kpfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.kpfilt' kind='element'"
     * @generated
     */
    Float getKpfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @generated
     */
    void setKpfilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Float)
     * @generated
     */
    void unsetKpfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpfilt</em>' attribute is set.
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Float)
     * @generated
     */
    boolean isSetKpfilt();

    /**
     * Returns the value of the '<em><b>Kprr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kprr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #setKprr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Kprr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.kprr' kind='element'"
     * @generated
     */
    Float getKprr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #getKprr()
     * @generated
     */
    void setKprr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKprr()
     * @see #getKprr()
     * @see #setKprr(Float)
     * @generated
     */
    void unsetKprr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kprr</em>' attribute is set.
     * @see #unsetKprr()
     * @see #getKprr()
     * @see #setKprr(Float)
     * @generated
     */
    boolean isSetKprr();

    /**
     * Returns the value of the '<em><b>Rmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #setRmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Rmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.rmax' kind='element'"
     * @generated
     */
    Float getRmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #getRmax()
     * @generated
     */
    void setRmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmax()
     * @see #getRmax()
     * @see #setRmax(Float)
     * @generated
     */
    void unsetRmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmax</em>' attribute is set.
     * @see #unsetRmax()
     * @see #getRmax()
     * @see #setRmax(Float)
     * @generated
     */
    boolean isSetRmax();

    /**
     * Returns the value of the '<em><b>Rmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #setRmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Rmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.rmin' kind='element'"
     * @generated
     */
    Float getRmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #getRmin()
     * @generated
     */
    void setRmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmin()
     * @see #getRmin()
     * @see #setRmin(Float)
     * @generated
     */
    void unsetRmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmin</em>' attribute is set.
     * @see #unsetRmin()
     * @see #getRmin()
     * @see #setRmin(Float)
     * @generated
     */
    boolean isSetRmin();

    /**
     * Returns the value of the '<em><b>Tomegafiltrr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tomegafiltrr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tomegafiltrr</em>' attribute.
     * @see #isSetTomegafiltrr()
     * @see #unsetTomegafiltrr()
     * @see #setTomegafiltrr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Tomegafiltrr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.tomegafiltrr' kind='element'"
     * @generated
     */
    Float getTomegafiltrr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegafiltrr</em>' attribute.
     * @see #isSetTomegafiltrr()
     * @see #unsetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @generated
     */
    void setTomegafiltrr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @see #setTomegafiltrr(Float)
     * @generated
     */
    void unsetTomegafiltrr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegafiltrr</em>' attribute is set.
     * @see #unsetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @see #setTomegafiltrr(Float)
     * @generated
     */
    boolean isSetTomegafiltrr();

    /**
     * Returns the value of the '<em><b>Tpfiltrr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfiltrr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfiltrr</em>' attribute.
     * @see #isSetTpfiltrr()
     * @see #unsetTpfiltrr()
     * @see #setTpfiltrr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_Tpfiltrr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.tpfiltrr' kind='element'"
     * @generated
     */
    Float getTpfiltrr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfiltrr</em>' attribute.
     * @see #isSetTpfiltrr()
     * @see #unsetTpfiltrr()
     * @see #getTpfiltrr()
     * @generated
     */
    void setTpfiltrr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfiltrr()
     * @see #getTpfiltrr()
     * @see #setTpfiltrr(Float)
     * @generated
     */
    void unsetTpfiltrr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfiltrr</em>' attribute is set.
     * @see #unsetTpfiltrr()
     * @see #getTpfiltrr()
     * @see #setTpfiltrr(Float)
     * @generated
     */
    boolean isSetTpfiltrr();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Turbine Type2 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_WindGenTurbineType2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.WindGenTurbineType2IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType2IEC getWindGenTurbineType2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @generated
     */
    void setWindGenTurbineType2IEC( WindGenTurbineType2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    void unsetWindGenTurbineType2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType2IEC();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContRotorRIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContRotorRIEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

} // WindContRotorRIEC
