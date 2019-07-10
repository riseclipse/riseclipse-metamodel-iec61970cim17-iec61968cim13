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
 * A representation of the model object '<em><b>Overexc Lim2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getKoi <em>Koi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimax <em>Voimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimin <em>Voimin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLim2()
 * @model
 * @generated
 */
public interface OverexcLim2 extends OverexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Ifdlim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifdlim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #setIfdlim(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLim2_Ifdlim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLim2.ifdlim' kind='element'"
     * @generated
     */
    Float getIfdlim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @generated
     */
    void setIfdlim( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Float)
     * @generated
     */
    void unsetIfdlim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifdlim</em>' attribute is set.
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Float)
     * @generated
     */
    boolean isSetIfdlim();

    /**
     * Returns the value of the '<em><b>Koi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Koi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Koi</em>' attribute.
     * @see #isSetKoi()
     * @see #unsetKoi()
     * @see #setKoi(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLim2_Koi()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLim2.koi' kind='element'"
     * @generated
     */
    Float getKoi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Koi</em>' attribute.
     * @see #isSetKoi()
     * @see #unsetKoi()
     * @see #getKoi()
     * @generated
     */
    void setKoi( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKoi()
     * @see #getKoi()
     * @see #setKoi(Float)
     * @generated
     */
    void unsetKoi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Koi</em>' attribute is set.
     * @see #unsetKoi()
     * @see #getKoi()
     * @see #setKoi(Float)
     * @generated
     */
    boolean isSetKoi();

    /**
     * Returns the value of the '<em><b>Voimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voimax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voimax</em>' attribute.
     * @see #isSetVoimax()
     * @see #unsetVoimax()
     * @see #setVoimax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLim2_Voimax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLim2.voimax' kind='element'"
     * @generated
     */
    Float getVoimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voimax</em>' attribute.
     * @see #isSetVoimax()
     * @see #unsetVoimax()
     * @see #getVoimax()
     * @generated
     */
    void setVoimax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoimax()
     * @see #getVoimax()
     * @see #setVoimax(Float)
     * @generated
     */
    void unsetVoimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voimax</em>' attribute is set.
     * @see #unsetVoimax()
     * @see #getVoimax()
     * @see #setVoimax(Float)
     * @generated
     */
    boolean isSetVoimax();

    /**
     * Returns the value of the '<em><b>Voimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voimin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voimin</em>' attribute.
     * @see #isSetVoimin()
     * @see #unsetVoimin()
     * @see #setVoimin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOverexcLim2_Voimin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OverexcLim2.voimin' kind='element'"
     * @generated
     */
    Float getVoimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voimin</em>' attribute.
     * @see #isSetVoimin()
     * @see #unsetVoimin()
     * @see #getVoimin()
     * @generated
     */
    void setVoimin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoimin()
     * @see #getVoimin()
     * @see #setVoimin(Float)
     * @generated
     */
    void unsetVoimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voimin</em>' attribute is set.
     * @see #unsetVoimin()
     * @see #getVoimin()
     * @see #setVoimin(Float)
     * @generated
     */
    boolean isSetVoimin();

} // OverexcLim2
