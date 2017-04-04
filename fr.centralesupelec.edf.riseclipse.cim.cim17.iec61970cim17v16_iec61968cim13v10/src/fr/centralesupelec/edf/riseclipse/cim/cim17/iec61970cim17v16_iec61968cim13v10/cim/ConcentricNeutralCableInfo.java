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
 * A representation of the model object '<em><b>Concentric Neutral Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandGmr <em>Neutral Strand Gmr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRadius <em>Neutral Strand Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRDC20 <em>Neutral Strand RDC20</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo()
 * @model
 * @generated
 */
public interface ConcentricNeutralCableInfo extends CableInfo {
    /**
     * Returns the value of the '<em><b>Diameter Over Neutral</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diameter Over Neutral</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diameter Over Neutral</em>' attribute.
     * @see #isSetDiameterOverNeutral()
     * @see #unsetDiameterOverNeutral()
     * @see #setDiameterOverNeutral(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo_DiameterOverNeutral()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConcentricNeutralCableInfo.diameterOverNeutral' kind='element'"
     * @generated
     */
    Float getDiameterOverNeutral();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diameter Over Neutral</em>' attribute.
     * @see #isSetDiameterOverNeutral()
     * @see #unsetDiameterOverNeutral()
     * @see #getDiameterOverNeutral()
     * @generated
     */
    void setDiameterOverNeutral( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiameterOverNeutral()
     * @see #getDiameterOverNeutral()
     * @see #setDiameterOverNeutral(Float)
     * @generated
     */
    void unsetDiameterOverNeutral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diameter Over Neutral</em>' attribute is set.
     * @see #unsetDiameterOverNeutral()
     * @see #getDiameterOverNeutral()
     * @see #setDiameterOverNeutral(Float)
     * @generated
     */
    boolean isSetDiameterOverNeutral();

    /**
     * Returns the value of the '<em><b>Neutral Strand Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Strand Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Strand Count</em>' attribute.
     * @see #isSetNeutralStrandCount()
     * @see #unsetNeutralStrandCount()
     * @see #setNeutralStrandCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo_NeutralStrandCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConcentricNeutralCableInfo.neutralStrandCount' kind='element'"
     * @generated
     */
    Integer getNeutralStrandCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Strand Count</em>' attribute.
     * @see #isSetNeutralStrandCount()
     * @see #unsetNeutralStrandCount()
     * @see #getNeutralStrandCount()
     * @generated
     */
    void setNeutralStrandCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStrandCount()
     * @see #getNeutralStrandCount()
     * @see #setNeutralStrandCount(Integer)
     * @generated
     */
    void unsetNeutralStrandCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Strand Count</em>' attribute is set.
     * @see #unsetNeutralStrandCount()
     * @see #getNeutralStrandCount()
     * @see #setNeutralStrandCount(Integer)
     * @generated
     */
    boolean isSetNeutralStrandCount();

    /**
     * Returns the value of the '<em><b>Neutral Strand Gmr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Strand Gmr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Strand Gmr</em>' attribute.
     * @see #isSetNeutralStrandGmr()
     * @see #unsetNeutralStrandGmr()
     * @see #setNeutralStrandGmr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo_NeutralStrandGmr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConcentricNeutralCableInfo.neutralStrandGmr' kind='element'"
     * @generated
     */
    Float getNeutralStrandGmr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandGmr <em>Neutral Strand Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Strand Gmr</em>' attribute.
     * @see #isSetNeutralStrandGmr()
     * @see #unsetNeutralStrandGmr()
     * @see #getNeutralStrandGmr()
     * @generated
     */
    void setNeutralStrandGmr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandGmr <em>Neutral Strand Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStrandGmr()
     * @see #getNeutralStrandGmr()
     * @see #setNeutralStrandGmr(Float)
     * @generated
     */
    void unsetNeutralStrandGmr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandGmr <em>Neutral Strand Gmr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Strand Gmr</em>' attribute is set.
     * @see #unsetNeutralStrandGmr()
     * @see #getNeutralStrandGmr()
     * @see #setNeutralStrandGmr(Float)
     * @generated
     */
    boolean isSetNeutralStrandGmr();

    /**
     * Returns the value of the '<em><b>Neutral Strand Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Strand Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Strand Radius</em>' attribute.
     * @see #isSetNeutralStrandRadius()
     * @see #unsetNeutralStrandRadius()
     * @see #setNeutralStrandRadius(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo_NeutralStrandRadius()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConcentricNeutralCableInfo.neutralStrandRadius' kind='element'"
     * @generated
     */
    Float getNeutralStrandRadius();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRadius <em>Neutral Strand Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Strand Radius</em>' attribute.
     * @see #isSetNeutralStrandRadius()
     * @see #unsetNeutralStrandRadius()
     * @see #getNeutralStrandRadius()
     * @generated
     */
    void setNeutralStrandRadius( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRadius <em>Neutral Strand Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStrandRadius()
     * @see #getNeutralStrandRadius()
     * @see #setNeutralStrandRadius(Float)
     * @generated
     */
    void unsetNeutralStrandRadius();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRadius <em>Neutral Strand Radius</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Strand Radius</em>' attribute is set.
     * @see #unsetNeutralStrandRadius()
     * @see #getNeutralStrandRadius()
     * @see #setNeutralStrandRadius(Float)
     * @generated
     */
    boolean isSetNeutralStrandRadius();

    /**
     * Returns the value of the '<em><b>Neutral Strand RDC20</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Strand RDC20</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Strand RDC20</em>' attribute.
     * @see #isSetNeutralStrandRDC20()
     * @see #unsetNeutralStrandRDC20()
     * @see #setNeutralStrandRDC20(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConcentricNeutralCableInfo_NeutralStrandRDC20()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConcentricNeutralCableInfo.neutralStrandRDC20' kind='element'"
     * @generated
     */
    Float getNeutralStrandRDC20();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRDC20 <em>Neutral Strand RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Strand RDC20</em>' attribute.
     * @see #isSetNeutralStrandRDC20()
     * @see #unsetNeutralStrandRDC20()
     * @see #getNeutralStrandRDC20()
     * @generated
     */
    void setNeutralStrandRDC20( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRDC20 <em>Neutral Strand RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStrandRDC20()
     * @see #getNeutralStrandRDC20()
     * @see #setNeutralStrandRDC20(Float)
     * @generated
     */
    void unsetNeutralStrandRDC20();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo#getNeutralStrandRDC20 <em>Neutral Strand RDC20</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Strand RDC20</em>' attribute is set.
     * @see #unsetNeutralStrandRDC20()
     * @see #getNeutralStrandRDC20()
     * @see #setNeutralStrandRDC20(Float)
     * @generated
     */
    boolean isSetNeutralStrandRDC20();

} // ConcentricNeutralCableInfo
